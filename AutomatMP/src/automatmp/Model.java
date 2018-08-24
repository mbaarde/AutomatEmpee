package automatmp;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Model {
    
    private String[] entities;
    private ArrayList<String> spaceship;
    private ArrayList<String> Earth;
    private ArrayList<String> Mars;
    private ArrayList<Node> nodes;
    
    public Model () {
        this.Earth = new ArrayList<String>();
        this.Mars = new ArrayList<String>();
        this.spaceship = new ArrayList<String>();
        this.entities = new String[] {"Savage", "Cow", "Lion", "Grain", "Human", "Scientist"};
        
        //initialize all entities to earth at the start
        Earth.add("Savage");
        Earth.add("Cow");
        Earth.add("Lion");
        Earth.add("Grain");
        Earth.add("Human");
        Earth.add("Scientist");
        
        this.nodes = new ArrayList<>();
	addNodes();
    }
    
    public String[] getEntities () {
        return entities;
    }

    public ArrayList<String> getSpaceship () {
        return spaceship;
    }
    
       public ArrayList<String> getEarth() {
        return Earth;
    }

    public ArrayList<String> getMars() {
        return Mars;
    }
	
	private void addNodes() {
		
		Node q0 = new Node(0,"HHGCLS",false);
		nodes.add(q0);

		Node q1 = new Node(1,"CLS",false);
		nodes.add(q1);
		
		Node q2 = new Node(2,"CS",false);
		nodes.add(q2);	
		
		Node q3 = new Node(3,"CGS",false);
		nodes.add(q3);		

		Node q4 = new Node(4,"CS",false);
		nodes.add(q4);				

		Node q5 = new Node(5,"HHS",false);
		nodes.add(q5);			
		
		Node q6 = new Node(6,"LS",false);
		nodes.add(q6);	
		
		Node q7 = new Node(7,"CLS",false);
		nodes.add(q7);			

		Node q8 = new Node(8,"LS",false);
		nodes.add(q8);	
		
		Node q9 = new Node(9,"HHS",false);
		nodes.add(q9);	
		
		Node q10 = new Node(10,"CS",false);
		nodes.add(q10);	
		
		Node q11 = new Node(11,"CGS",false);
		nodes.add(q11);		
		
		Node q12 = new Node(12,"CS",false);
		nodes.add(q12);	
		
		Node q13 = new Node(13,"LHS",false);
		nodes.add(q13);		

		Node q14 = new Node(14,"CLS",false);
		nodes.add(q14);	

		Node q15 = new Node(15,"HHGCLS",true);
		nodes.add(q15);			
		
		/*
                q0 = 000000
                q1 = 000111
                q2 = 000010
                q3 = 001111
                q4 = 001010
                q5 = 111011
                q6 = 111000
                q7 = 000100
                q8 = 110101
                q9 = 110000
                q10 = 111101
                q11 = 010111
                q12 = 010000
                q13 = 011111
                q14 = 011000
                q15 = 111111
                */
		
		q0.addTransition(new Transition("CLS",q1));
                
		q1.addTransition(new Transition("CLS",q0));
		q1.addTransition(new Transition("LS",q7));
		q1.addTransition(new Transition("CS",q2));
                
		q2.addTransition(new Transition("CS",q1));
		q2.addTransition(new Transition("CGS",q3));
		q2.addTransition(new Transition("HCS",q11));
                
		q3.addTransition(new Transition("CS",q4));
		q3.addTransition(new Transition("LGS",q7));
		q3.addTransition(new Transition("CGS",q2));
                
		q4.addTransition(new Transition("HHS",q5));
		q4.addTransition(new Transition("HCS",q13));
		q4.addTransition(new Transition("CS",q3));
                
		q5.addTransition(new Transition("HHS",q4));
		q5.addTransition(new Transition("LS",q6));
		q5.addTransition(new Transition("LGS",q9));
		q5.addTransition(new Transition("LHS",q14));
                
		q6.addTransition(new Transition("LS",q5));
		q6.addTransition(new Transition("CLS",q15));
		q6.addTransition(new Transition("CS",q10));
                
		q7.addTransition(new Transition("LS",q1));
		q7.addTransition(new Transition("LGS",q3));
                q7.addTransition(new Transition("LHS",q11));
                q7.addTransition(new Transition("HHS",q8));
                
		q8.addTransition(new Transition("HHS",q7));
		q8.addTransition(new Transition("HCS",q12));
		q8.addTransition(new Transition("CS",q9));
                
		q9.addTransition(new Transition("CGS",q10));
		q9.addTransition(new Transition("CS",q8));
		q9.addTransition(new Transition("LGS",q5));
                
                //q10
                q10.addTransition(new Transition("CGS",q9));
                q10.addTransition(new Transition("CS",q6));
                q10.addTransition(new Transition("HCS",q14));
                
		q11.addTransition(new Transition("LHS",q7));
                q11.addTransition(new Transition("HCS",q2));
		q11.addTransition(new Transition("CLS",q12));
                
		q12.addTransition(new Transition("HCS",q8));
		q12.addTransition(new Transition("CLS",q11));
                
		q13.addTransition(new Transition("HCS",q4));
                q13.addTransition(new Transition("CLS",q14));
                
		q14.addTransition(new Transition("CLS",q13));
                q14.addTransition(new Transition("HCS",q10));
                q14.addTransition(new Transition("LHS",q5));


	
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}  
    
}
