import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    // A map representing the adjacency list of the graph
    private Map<Vertex<V>, List<Vertex<V>>> adjacencyMap;

    public WeightedGraph() {
        // Initialize the adjacencyMap as a new HashMap
        adjacencyMap = new HashMap<>();
    }

    // Adds a vertex to the graph
    public void addVertex(Vertex<V> vertex) {
        // Add the vertex to the adjacencyMap with an empty list of adjacent vertices
        adjacencyMap.put(vertex, new ArrayList<>());
    }

    // Adds an edge between source and destination vertices with the given weight
    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        // Retrieve the list of adjacent vertices for the source vertex
        List<Vertex<V>> adjacentVertices = adjacencyMap.get(source);
        // Add the destination vertex to the list of adjacent vertices
        adjacentVertices.add(destination);

        // Update the adjacency information of the source vertex
        source.addAdjacentVertex(destination, weight);
    }

    // Returns a list of adjacent vertices to the specified vertex
    public List<Vertex<V>> getAdjacentVertices(Vertex<V> vertex) {
        return adjacencyMap.get(vertex);
    }
}

