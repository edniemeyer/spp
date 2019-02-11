package spp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * This class represents a Node from a Graph, each node needs to have a name, 
 * a list of adjacent nodes and distance between them and for this task a LinkedList
 * of Nodes that will represent the shortest path to get from one Node to another 
 */
public class Node {
	
	private String name;
	private Map<Node, Integer> adjacentNodes = new HashMap<Node, Integer>();
	private List<Node> shortestPath = new LinkedList<Node>(); 
	
	//for Dijkstra's algorithm all of the nodes besides the source one needs to have infinite distance
	private Integer distance = Integer.MAX_VALUE;
	
	//constructor with name setting
	public Node(String name) {
		this.setName(name);
	}
	
	//adding node
	public void addAdjacentNode(Node adjacent, Integer distance) {
		adjacentNodes.put(adjacent, distance);
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Node> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Node> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public Map<Node, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}
	
	

}
