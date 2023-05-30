import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    // Constructor to create a new vertex with the given data
    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }
    // Adds an adjacent vertex with the given weight to the current vertex
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }
    // Returns the data of the vertex
    public V getData() {
        return data;
    }
    // Returns the map of adjacent vertices and their corresponding weights
    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
}








