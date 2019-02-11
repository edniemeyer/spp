package spp;

import java.util.HashSet;
import java.util.Set;

/*
 * A Graph is a set of Nodes, so it needs an attribute representing this set and a method to add Nodes to it
 */
public class Graph {

	private Set<Node> nodes = new HashSet<Node>();
	
	public void addNode(Node node) {
		nodes.add(node);
	}

	public Set<Node> getNodes() {
		return nodes;
	}

	public void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}
}
