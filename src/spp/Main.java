package spp;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
