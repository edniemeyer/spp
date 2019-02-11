package spp;

/*
 * This class creates the Graph as asked on the task 
 */
public class Data {
	
	private Graph railNetwork;
	
	
	public Data() {
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D"); 
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeI = new Node("I");
		Node nodeJ = new Node("J");
		
		
		nodeA.addAdjacentNode(nodeE, 20);
		nodeA.addAdjacentNode(nodeD, 19);
		nodeA.addAdjacentNode(nodeG, 16);
		nodeA.addAdjacentNode(nodeB, 12);
		
		nodeB.addAdjacentNode(nodeD, 13);
		nodeB.addAdjacentNode(nodeC, 5);
		nodeB.addAdjacentNode(nodeI, 15);
		
		nodeC.addAdjacentNode(nodeD, 5);
		
		nodeD.addAdjacentNode(nodeE, 7);
		
		nodeE.addAdjacentNode(nodeF, 5);
		
		nodeF.addAdjacentNode(nodeA, 5);
		
		nodeG.addAdjacentNode(nodeF, 11);
		
		nodeH.addAdjacentNode(nodeG, 6);
		nodeH.addAdjacentNode(nodeA, 4);
		nodeH.addAdjacentNode(nodeB, 19);
		
		nodeI.addAdjacentNode(nodeH, 21);
		nodeI.addAdjacentNode(nodeJ, 10);
		
		nodeJ.addAdjacentNode(nodeB, 7);
		nodeJ.addAdjacentNode(nodeC, 15);
		
		 
		Graph graph = new Graph();
		 
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);
		graph.addNode(nodeG);
		graph.addNode(nodeH);
		graph.addNode(nodeI);
		graph.addNode(nodeJ);
		
		this.setRailNetwork(graph);
	}


	public Graph getRailNetwork() {
		return railNetwork;
	}


	public void setRailNetwork(Graph railNetwork) {
		this.railNetwork = railNetwork;
	}

}
