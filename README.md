# ads6new
TASK 1: creating VERTEX class. 
The Vertex class is parameterized with a generic type V to represent the type of data associated with the vertex. The constructor of the Vertex class takes the data
parameter and initializes the vertex with the provided data. In the constructor, the adjacentVertices map is initialized as an empty HashMap, which will be used to 
store the adjacent vertices and their edge weights. The getData method simply returns the data associated with the vertex. The addEdge method is used to add an 
adjacent vertex to the current vertex. It takes the vertex parameter, which is the adjacent vertex, and the weight parameter, which is the weight of the edge connecting
the current vertex to the adjacent vertex. It adds the adjacent vertex and its weight to the adjacentVertices map. The getAdjacentVertices method returns the 
adjacentVertices map, which contains the adjacent vertices of the current vertex along with their edge weights.

TASK 2: creating WeightedGraph class.The WeightedGraph class is parameterized with a generic type V to represent the type of data associated with the vertices of the graph. The class has a private data member graph of type Map<Vertex, List<Vertex>>, which represents the graph structure. It uses a map to store each vertex as a key and its corresponding adjacent vertices as values in the form of a list. The constructor of the WeightedGraph class initializes the graph as an empty HashMap.
