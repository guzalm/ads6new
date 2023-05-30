import java.util.*;
public class DijkstraSearch<V> extends Search<V> {
    private Map<Vertex<V>, Double> distance;
    private Map<Vertex<V>, Vertex<V>> previous;

    // Initialize object with a given graph
    public DijkstraSearch(WeightedGraph<V> graph) {
        super(graph); // Call the constructor of the parent class to initialize the graph
        distance = new HashMap<>(); // Initialize a map to store the distances between ver
        previous = new HashMap<>(); // Initialize a map to store the previous vertex in the shortest path
    }

    // Method to perform Dijkstra's algorithm starting from a given startVertex
    public void dijkstra(Vertex<V> startVertex) {
        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(distance::get)); // Create a priority queue to store vertices
        distance.put(startVertex, 0.0); // Set the distance of the startVertex to 0
        pq.offer(startVertex); // Add the startVertex to the priority queue

        // Iterate until the priority queue becomes empty
        while (!pq.isEmpty()) {
            Vertex<V> currentVertex = pq.poll(); // Get the vertex with the smallest distance from the priority queue

            // Get the adjacent vertices of the current vertex
            List<Vertex<V>> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for (Vertex<V> vertex : adjacentVertices) {
                double edgeWeight = currentVertex.getAdjacentVertices().get(vertex); // Get the weight of the edge between the current vertex and the adjacent vertex
                double currentDistance = distance.getOrDefault(currentVertex, Double.POSITIVE_INFINITY); // Get the current distance to the current vertex
                double newDistance = currentDistance + edgeWeight; // Calculate the new distance to the adjacent vertex via the current vertex

                // Check if the new distance is shorter than the existing distance to the adjacent vertex
                if (newDistance < distance.getOrDefault(vertex, Double.POSITIVE_INFINITY)) {
                    pq.remove(vertex); // Remove the adjacent vertex from the priority queue to update its distance
                    distance.put(vertex, newDistance); // Update the distance to the adjacent vertex
                    previous.put(vertex, currentVertex); // Set the current vertex as the previous vertex in the shortest path
                    pq.offer(vertex); // Add the adjacent vertex back to the priority queue with the updated distance
                }
            }
        }
    }

    // Method to retrieve the shortest path from the start vertex to the given destination vertex
    public List<Vertex<V>> shortestPath(Vertex<V> destination) {
        List<Vertex<V>> path = new ArrayList<>();
        Vertex<V> currentVertex = destination;

        // Traverse backwards from the destination vertex to the start vertex using the previous map
        while (currentVertex != null) {
            path.add(currentVertex); // Add the current vertex to the path
            currentVertex = previous.get(currentVertex); // Move to the previous vertex
        }

        Collections.reverse(path); // Reverse the path to obtain the correct order from start to destination
        return path;
    }
}
