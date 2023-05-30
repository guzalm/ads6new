# ads6new
TASK 1: creating VERTEX class. 
The Vertex class is parameterized with a generic type V to represent the type of data associated with the vertex. The constructor of the Vertex class takes the data
parameter and initializes the vertex with the provided data. In the constructor, the adjacentVertices map is initialized as an empty HashMap, which will be used to 
store the adjacent vertices and their edge weights. The getData method simply returns the data associated with the vertex. The addEdge method is used to add an 
adjacent vertex to the current vertex. It takes the vertex parameter, which is the adjacent vertex, and the weight parameter, which is the weight of the edge connecting
the current vertex to the adjacent vertex. It adds the adjacent vertex and its weight to the adjacentVertices map. The getAdjacentVertices method returns the 
adjacentVertices map, which contains the adjacent vertices of the current vertex along with their edge weights.

TASK 2: creating WeightedGraph class.The WeightedGraph class is parameterized with a generic type V to represent the type of data associated with the vertices of the graph. The class has a private data member graph of type Map<Vertex, List<Vertex>>, which represents the graph structure. It uses a map to store each vertex as a key and its corresponding adjacent vertices as values in the form of a list. The constructor of the WeightedGraph class initializes the graph as an empty HashMap.

TASK 3: creating Search class. It works with a weighted graph. Class has a generic type parameter V. It has a constructor that initializes the class with a given graph. The class is designed to perform search operations on the graph. Line 'protected WeightedGraph<V> graph;' declares a protected instance variable called graph of type WeightedGraph<V>

Task 5: creating DijkstraSearch class. It extends the Search class. It implements Dijkstra's algorithm to find the shortest path in a weighted graph. The dijkstra method performs Dijkstra's algorithm starting from a given startVertex. It calculates and updates the distances to each vertex and keeps track of the previous vertex in the shortest path. The shortestPath method retrieves the shortest path from the start vertex to a given destination vertex using the information stored in the previous map.
