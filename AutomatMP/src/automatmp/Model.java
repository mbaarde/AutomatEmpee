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
    
    private String[] entities = new String[] {"Savage", "Cow", "Lion", "Astronaut", "Grain"};
    private ArrayList<String> spaceship =  new ArrayList<String>();
    
    
    public void move(){
        
    }
    
    public boolean checkCompatible () {
        boolean status = false;
        
        return status;
    }
    
    public void board(String entity){
        if (spaceship.size() < 3){
            spaceship.add(entity);
            System.out.println("Added " + entity + " at index " + spaceship.size());
        } else System.out.println("Spaceship is full!");
       
    }
    
    public String[] getEntities() {
        return entities;
    }

    public ArrayList<String> getSpaceship() {
        return spaceship;
    }

    
    
    
    
    
    
}
