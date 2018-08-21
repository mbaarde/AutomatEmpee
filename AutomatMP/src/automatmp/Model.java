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
    
    

    
    
    
    
    
    
}
