# ads6new
TASK 1: creating VERTEX class. 
The Vertex class is parameterized with a generic type V to represent the type of data associated with the vertex. The constructor of the Vertex class takes the data
parameter and initializes the vertex with the provided data. In the constructor, the adjacentVertices map is initialized as an empty HashMap, which will be used to 
store the adjacent vertices and their edge weights. The getData method simply returns the data associated with the vertex. The addEdge method is used to add an 
adjacent vertex to the current vertex. It takes the vertex parameter, which is the adjacent vertex, and the weight parameter, which is the weight of the edge connecting
the current vertex to the adjacent vertex. It adds the adjacent vertex and its weight to the adjacentVertices map. The getAdjacentVertices method returns the 
adjacentVertices map, which contains the adjacent vertices of the current vertex along with their edge weights.
