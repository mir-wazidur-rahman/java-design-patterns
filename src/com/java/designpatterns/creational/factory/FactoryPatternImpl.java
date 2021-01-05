package com.java.designpatterns.creational.factory;

interface Algorithm {
	
	void solve();
	
}

class ShortestPath implements Algorithm {

	@Override
	public void solve() {
		System.out.println("Solving the shortest path algo");
		
	}
	
}

class SpanningTrees implements Algorithm {

	@Override
	public void solve() {
		System.out.println("Solving the spanning trees algo");
	}
	
}

class AlgorithmFactory{
	
	public static final int SHORTEST_PATH = 0;
	public static final int SPANNING_TREE = 1;
	
	public static Algorithm createAlgorithm (int type) {
		
		switch(type) {
		case SHORTEST_PATH:
			return new ShortestPath();
		case SPANNING_TREE:
			return new SpanningTrees();
		
			default:
				return null;
		}
	}
	
}

public class FactoryPatternImpl {

	public static void main(String[] args) {
		Algorithm algo = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
		algo.solve();
	}
}
