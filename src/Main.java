import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create a weighted graph
        WeightedGraph<String> graph = new WeightedGraph<>();

        // Create vertex objects
        Vertex<String> v1 = new Vertex<>("A");
        Vertex<String> v2 = new Vertex<>("B");
        Vertex<String> v3 = new Vertex<>("C");
        Vertex<String> v4 = new Vertex<>("D");
        Vertex<String> v5 = new Vertex<>("E");

        // Add vertices to the graph
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        // Add edges to the graph
        graph.addEdge(v1, v2, 1);
        graph.addEdge(v1, v3, 4);
        graph.addEdge(v2, v3, 2);
        graph.addEdge(v2, v4, 5);
        graph.addEdge(v3, v4, 1);
        graph.addEdge(v4, v5, 3);

        // Perform breadth-first search on the graph
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);
        System.out.println("BFS:");
        bfs.bfs(v1);

        // Perform Dijkstra's algorithm on the graph
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph);
        dijkstra.dijkstra(v1);

        // Find the shortest path from vertex A to E using Dijkstra's algorithm
        System.out.println("Shortest path from A to E:");
        List<Vertex<String>> shortestPath = dijkstra.shortestPath(v5);
        for (Vertex<String> vertex : shortestPath) {
            System.out.print(vertex.getData() + " -> ");
        }
    }
}
