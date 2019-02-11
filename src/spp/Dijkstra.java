package spp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Class that implements Dijkstra's algorithm to find shortest paths between nodes
 */
public class Dijkstra {
	private Graph graph;
	
	public Dijkstra(Graph data, Node source) {
		source.setDistance(0); // all nodes besides source are infinite distance on the beginning (unknown distance)
		Set<Node> unvisitedNodes = new HashSet<Node>();
		Set<Node> visitedNodes = new HashSet<Node>();
		
		unvisitedNodes.add(source);
		
		while(!unvisitedNodes.isEmpty()) {
			//getting the node with lowest distance from the set of unvisited nodes
			Node currentNode = null;
			int lowestDistance = Integer.MAX_VALUE;
		    for (Node node: unvisitedNodes) {
		        int nodeDistance = node.getDistance();
		        if (nodeDistance < lowestDistance) {
		            lowestDistance = nodeDistance;
		            currentNode = node;
		        }
		    }
		    
		    unvisitedNodes.remove(currentNode);
		    
		    for (Entry<Node, Integer> adjacentNodeEntry : currentNode.getAdjacentNodes().entrySet()) {
		    	Node adjacentNode = adjacentNodeEntry.getKey();
		    	Integer distance = adjacentNodeEntry.getValue();
		    	
		    	if(!visitedNodes.contains(adjacentNode)) {
		    		calculateMinimumDistance(adjacentNode, distance, currentNode);
		    		unvisitedNodes.add(adjacentNode);
		    	}
				
			}
		    visitedNodes.add(currentNode);
		}
		this.setGraph(data);
		
	}
	/*
	 * this method compares the distance of a (evaluationNode) with the (sourceNode + distance between them) 
	 * and sets the shortest path between a sourceNode and an evaluationNode
	 */
	private void calculateMinimumDistance(Node evaluationNode,
			  Integer distance, Node sourceNode) {
			    Integer sourceDistance = sourceNode.getDistance();
			    if (sourceDistance + distance < evaluationNode.getDistance()) {
			        evaluationNode.setDistance(sourceDistance + distance);
			        LinkedList<Node> shortestPath = new LinkedList<Node>(sourceNode.getShortestPath());
			        shortestPath.add(sourceNode);
			        evaluationNode.setShortestPath(shortestPath);
			    }
			}
	public Graph getGraph() {
		return graph;
	}
	public void setGraph(Graph graph) {
		this.graph = graph;
	}
}
