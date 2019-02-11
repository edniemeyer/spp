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
	
	//constructor with name setting
	public Node(String name) {
		this.name = name;
	}
	
	//adding node
	public void addAdjacentNode(Node adjacent, Integer distance) {
		adjacentNodes.put(adjacent, distance);
	}
	
	

}
