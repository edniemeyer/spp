# SPP
NZ Post Developer Coding Task

The task is to find the shortest path (https://en.wikipedia.org/wiki/Shortest_path_problem) between two nodes in a graph, chosen by the user. The easiest way to do that is using Dijkstra's algorithm (https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm). I will use JAVA to do that as it is the language that I'm more used to.

# Running it:

To run this application you can just import it on Eclipse and run Main.java as a Java Application and add two arguments between A and J on the Arguments tab of Run Configurations.

To run it from command line just run "javac path/to/spp/src/spp.Main" and then run "java spp.Main a j" 

# Ideas to improve the code:

Dijkstra's algorithm calculates the shortest path between a source node and all the other nodes in the graph. It has a time complexity of O(V²). We could try using another algorithm called A* that calculates the distance between a source node and a goal node and is faster. Other idea would be to store in a file or database all the distances calculated with Dijkstra's algorithm so we would need it to run only once to make the calculations and then we could just make queries to find the distances. As this is a small graph and the data doesn't change, both solution would work fine.

For bigger Graph data it would be necessary to use special Graph databases as Neo4j that can handle much bigger datasets and have optimized algorithms to run through the Graph and do the calculations needed to find shortest path much faster.