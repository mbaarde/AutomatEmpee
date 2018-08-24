package automatmp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
import java.util.ArrayList;

public final class BFS {

	Model model;
	ArrayList<ArrayList<Node>> solutionVisitedNodes;
	ArrayList<ArrayList<String>> solutionInputs;
	ArrayList<ArrayList<Node>> lowestSolutionVisitedNodes;
	ArrayList<ArrayList<String>> lowestSolutionInputs;
	
	public BFS(Model model) {
		this.model = model;
		solutionVisitedNodes = new ArrayList<>();
		solutionInputs = new ArrayList<>();
		lowestSolutionVisitedNodes = new ArrayList<>();
		lowestSolutionInputs = new ArrayList<>();
		Node initNode = model.getNodes().get(0);
		ArrayList<Node> visited = new ArrayList<>();
		visited.add(initNode);
		ArrayList<String> solution = new ArrayList<>();
		findSolution(initNode,visited,solution);
		int lowestMove = solutionInputs.get(0).size();
		for(int i = 1 ; i < solutionInputs.size() ; i++) {
			if(lowestMove > solutionInputs.get(i).size()) {
				lowestMove = solutionInputs.get(i).size();
			}
		}
		for(int i = 0 ; i < solutionInputs.size() ; i++) {
			if(lowestMove == solutionInputs.get(i).size()) {
				lowestSolutionVisitedNodes.add(solutionVisitedNodes.get(i));
				lowestSolutionInputs.add(solutionInputs.get(i));
			}
		}
	}
	
	public void findSolution(Node currentNode, ArrayList<Node> visited, ArrayList<String> solution) {
		if(!currentNode.isFinalState) {
			for(int i = 0 ; i < currentNode.getTransitions().size() ; i++) {
				Node newNode = currentNode.getTransitions().get(i).getDestination();
				if(!visited.contains(newNode)) {
					visited.add(newNode);
					solution.add(currentNode.getTransitions().get(i).getInput());
					findSolution(newNode, visited, solution);
					visited.remove(visited.size()-1);
					solution.remove(solution.size()-1);
                                        System.out.println(solution);
				}
			}
		}else {
			ArrayList<Node> newVisited = new ArrayList<>();
			ArrayList<String> newSolution = new ArrayList<>();
			newVisited.addAll(visited);
			newSolution.addAll(solution);
			addVisitedNode(newVisited);
			addInput(newSolution);
		}
	}
	
	public void addVisitedNode(ArrayList<Node> visited) {
		this.solutionVisitedNodes.add(visited);
	}
	
	public void addInput(ArrayList<String> solution) {
		this.solutionInputs.add(solution);
	}	
	
}
