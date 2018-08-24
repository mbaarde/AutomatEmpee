/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp;


/**
 *
 * @author Miguel
 */
public class Transition {

	private String input;
	private Node destination;
	
	public Transition(String input, Node destination) {
		this.input = input;
		this.destination = destination;
	}

	public String getInput() {
		return input;
	}

	public Node getDestination() {
		return destination;
	}

}
