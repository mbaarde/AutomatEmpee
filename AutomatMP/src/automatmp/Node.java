/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Node {
	private int nodeNumber;
	private String nodeLabel;
	private ArrayList<Transition> transitions;
	boolean isFinalState;
	
	public Node(int nodeNumber, String nodeLabel, boolean isFinalState) {
                this.nodeNumber = nodeNumber;
		this.nodeLabel = nodeLabel;
		this.isFinalState = isFinalState;
		transitions = new ArrayList<>();
	}

	public String getNodeLabel() {
		return nodeLabel;
	}

	public ArrayList<Transition> getTransitions() {
		return transitions;
	}

	public int getNodeNumber() {
		return nodeNumber;
	}
        
	public void addTransition(Transition newTransition) {
		transitions.add(newTransition);
	}        
        
	public boolean isFinalState() {
		return isFinalState;
	}
	
	    
    
    
}
