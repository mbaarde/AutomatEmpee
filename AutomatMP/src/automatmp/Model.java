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
    
    public Model (){
        this.Earth = new ArrayList<String>();
        this.Mars = new ArrayList<String>();
        this.spaceship = new ArrayList<String>();
        this.entities = new String[] {"Savage", "Cow", "Lion", "Grain"};
        
        spaceship.add("Scientist");
           
    }
    
    
    public void move (){
        
    }
    
    public boolean checkCompatible (String e1, String e2, String e3) {
        boolean status = false;
        
        return status;
    }
    
    public void board (String entity){
        
        if (spaceship.size() < 3){
            spaceship.add(entity);
            System.out.println("Added " + entity + " at index " + spaceship.size());
        } 
        else System.out.println("Spaceship is full!");
       
    }
    
    public void launch (ArrayList<String> origin, ArrayList<String> spaceship, ArrayList<String> destination){
        ArrayList<String> temp = new ArrayList<String>();
        
        if (planetCheck(origin) && planetCheck(spaceship)){
            for (int i=0;i<3;i++){
                if (!spaceship.get(i).equals("Scientist")){
                    destination.add(spaceship.get(i));
                    spaceship.remove(i);
                }
            }
        }
    }
    
    public boolean planetCheck (ArrayList<String> planet) {
        boolean allowed = true;
        
        if (planet.contains("Savage") && planet.contains("Cow")){
            allowed = false;
        } else if (planet.contains("Cow") && planet.contains("Grain")){
            allowed = false;
        } else if (planet.contains("Cow") && planet.contains("Lion")){
            allowed = false;
        } else if (planet.contains("Savage") && planet.contains("Lion")){
            allowed = false;
        }
        
        return allowed;
    }
    
    public String[] getEntities () {
        return entities;
    }

    public ArrayList<String> getSpaceship () {
        return spaceship;
    }

    
    
    
    
    
    
}
