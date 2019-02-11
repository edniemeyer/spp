package spp;

import java.util.ArrayList;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<String> possibleArguments = new ArrayList<String>();
		possibleArguments.add("A");
		possibleArguments.add("B");
		possibleArguments.add("C");
		possibleArguments.add("D");
		possibleArguments.add("E");
		possibleArguments.add("F");
		possibleArguments.add("G");
		possibleArguments.add("H");
		possibleArguments.add("I");
		possibleArguments.add("J");

		if(args.length == 0)
			throw new Exception("No input found");
		
		if (args.length != 2)
			throw new Exception("You can only input 2 arguments");
		
		if (!possibleArguments.contains(args[0].toUpperCase()) || !possibleArguments.contains(args[1].toUpperCase()))
			throw new Exception("Only inputs permitted are letters A to J");
		
		Node startNode = null, endNode = null;

		Data data = new Data();

		Graph graph = data.getRailNetwork();

		Set<Node> nodes = graph.getNodes();

		for (Node node : nodes) {
			if(node.getName().equals(args[0].toUpperCase()))
				startNode = node;
			if(node.getName().equals(args[1].toUpperCase()))
				endNode = node;
		}

		Dijkstra dijkstra = new Dijkstra(graph, startNode);

		graph = dijkstra.getGraph();

		nodes = graph.getNodes();

		for (Node node : nodes) {
			if(node.equals(endNode)) {
				for (Node path : node.getShortestPath()) {
					System.out.println(path.getName());
				}
				System.out.println(node.getName());
				System.out.println(node.getDistance());
			}
		}

	}

}
