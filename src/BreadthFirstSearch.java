import java.util.*;
public class BreadthFirstSearch<V> extends Search<V> {
    private Set<Vertex<V>> visited;

    // Constructor to initialize BreadthFirstSearch object with a given graph
    public BreadthFirstSearch(WeightedGraph<V> graph) {
        super(graph); // Call the constructor of the parent class to initialize the graph
        visited = new HashSet<>(); // Initialize a set to keep track of visited vertices
    }

    // Method to perform breadth-first search starting from a given startVertex
    public void bfs(Vertex<V> startVertex) {
        Queue<Vertex<V>> queue = new LinkedList<>(); // Create a queue to store vertices
        queue.offer(startVertex); // Add the startVertex to the queue
        visited.add(startVertex); // Mark the startVertex as visited

        // Iterate until the queue becomes empty
        while (!queue.isEmpty()) {
            Vertex<V> currentVertex = queue.poll(); // Get the next vertex from the queue
            System.out.println(currentVertex.getData()); // Process or print the data of the current vertex

            // Get the adjacent vertices of the current vertex
            List<Vertex<V>> adjacentVertices = graph.getAdjacentVertices(currentVertex);
            for (Vertex<V> vertex : adjacentVertices) {
                // Check if the vertex has not been visited before
                if (!visited.contains(vertex)) {
                    queue.offer(vertex); // Add the unvisited vertex to the queue
                    visited.add(vertex); // Mark the vertex as visited
                }
            }
        }
    }
}
