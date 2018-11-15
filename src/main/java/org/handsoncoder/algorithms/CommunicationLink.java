package org.handsoncoder.algorithms;

class CommunicationLink implements Comparable<CommunicationLink> {
	int sourceNode;
	int destinationNode;
	int bandwidth;

	@Override
	public int compareTo(CommunicationLink compareLink) {
		// Maximum Spanning tree
		return compareLink.bandwidth - this.bandwidth;
		// Minimum Spanning Tree
		//return this.bandwidth - compareLink.bandwidth;
	}

	public CommunicationLink(int sourceNode, int destinationNode, int bandwidth) {
		this.sourceNode = sourceNode;
		this.destinationNode = destinationNode;
		this.bandwidth = bandwidth;
	}
}
