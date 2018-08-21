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
        this.entities = new String[] {"Savage", "Cow", "Lion", "Grain", "Human", "Scientist"};
           
        Earth.add("Savage");
        Earth.add("Cow");
        Earth.add("Lion");
        Earth.add("Grain");
        Earth.add("Human");
        Earth.add("Scientist");
    }
    
    
    public void move (){
        
    }
    
    public boolean checkCompatible (String e1, String e2, String e3) {
        boolean status = false;
        
        return status;
    }
    
    public void board (ArrayList<String> origin, String entity){
        
        if (spaceship.size() < 3){
            origin.remove(entity);
            spaceship.add(entity);
            System.out.println("Added " + entity + " at index " + spaceship.size());
        } 
        else if (spaceship.size() == 3)
            System.out.println("Spaceship is full!");
       
    }
    
    public void launch (ArrayList<String> origin, ArrayList<String> spaceship, ArrayList<String> destination){
        ArrayList<String> tempship = spaceship;
        ArrayList<String> tempdest = destination;
        
        System.out.println("Origin: " + origin);
        System.out.println("Spaceship: " + spaceship);
        System.out.println("Destination: " + destination);
        
        if (spaceship.contains("Scientist")){
            if (isValid(origin)) { //check if origin planet is valid
                if (isValid(tempship)){ //check if spaceship is valid
                    for (int j=0;j<tempship.size();j++) 
                        tempdest.add(tempship.get(j));
                    if (isValid(tempdest)){ //check if new destination is valid
                        spaceship.clear();
                        System.out.println("Transfer success");
                    }
                }
                else
                    System.out.println("Spacehip not allowed");
            }
            else
                System.out.println("Origin planet not allowed");
        } 
        else if (!spaceship.contains("Scientist"))
            System.out.println("Spaceship does not contain scientist!");
    }
    
    public boolean isValid (ArrayList<String> planet) {
        boolean allowed = true;
        
        if (!planet.contains("Scientist")){
            
            if (planet.contains("Savage") && planet.contains("Cow")){
                allowed = false;
            } else if (planet.contains("Cow") && planet.contains("Grain")){
                allowed = false;
            } else if (planet.contains("Cow") && planet.contains("Lion")){
                allowed = false;
            } else if (planet.contains("Savage") && planet.contains("Lion")){
                allowed = false;
            } else if (planet.contains("Human") && planet.contains("Cow")){
                allowed = false;
            } else if (planet.contains("Human") && planet.contains("Lion")){
                allowed = false;
            }
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
