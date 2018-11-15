package org.handsoncoder.algorithms;

import java.util.Arrays;

public class CluNetConnectedGraph {

	public CluNetConnectedGraph(int v, int e) {
		V = v;
		E = e;
		graphLinks = new CommunicationLink[E];
	}

	int V, E;
	CommunicationLink graphLinks[];

	private int findParent(int v, int[] parent) {
		if (parent[v] == v) {
			return v;
		}
		return findParent(parent[v], parent);
	}

	public void convertGraphToMaxSpanningTree() {
		CommunicationLink mstLinks[] = new CommunicationLink[V - 1];
		Arrays.sort(graphLinks);

		// union
		int[] parent = new int[V];
		for (int i = 0; i < V; i++) {
			parent[i] = i;
		}
		int count = 0; // to count edges added to MST
		int i = 0; // denotes current edge on sorted edges
		while (count != V - 1) {
			CommunicationLink currentLink = graphLinks[i];
			// Check if we can add in MST or not
			int sourceNodeParent = findParent(currentLink.sourceNode, parent);
			int destinationNodeParent = findParent(currentLink.destinationNode, parent);

			// if source-parent and destination parent are different then it can be added
			if (sourceNodeParent != destinationNodeParent) {
				mstLinks[count] = currentLink;
				count++;
				parent[sourceNodeParent] = destinationNodeParent;
			}
			i++;
		}
		System.out.println(String.format("%-12s|%-12s|%12s", "source","destination","bandwidth"));
		for (int k = 0; k < V - 1; k++) {
			System.out.println(String.format("%-12s|%-12s|%12s", mstLinks[k].sourceNode, mstLinks[k].destinationNode,
					mstLinks[k].bandwidth));
		}
	}

	public static void main(String[] args) {

		int V = 6, E = 11;
		CluNetConnectedGraph graph = new CluNetConnectedGraph(V, E);
		graph.graphLinks[0] = new CommunicationLink(0, 3, 3);
		graph.graphLinks[1] = new CommunicationLink(3, 5, 7);
		graph.graphLinks[2] = new CommunicationLink(0, 1, 2);
		graph.graphLinks[3] = new CommunicationLink(3, 4, 11);
		graph.graphLinks[4] = new CommunicationLink(2, 1, 8);
		graph.graphLinks[5] = new CommunicationLink(4, 5, 5);
		graph.graphLinks[6] = new CommunicationLink(0, 2, 4);
		graph.graphLinks[7] = new CommunicationLink(2, 5, 10);
		graph.graphLinks[8] = new CommunicationLink(2, 4, 9);
		graph.graphLinks[9] = new CommunicationLink(1, 3, 1);
		graph.graphLinks[10] = new CommunicationLink(2, 3, 6);

		graph.convertGraphToMaxSpanningTree();
	}

}
