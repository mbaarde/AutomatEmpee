/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Controller {
    
    private Model model;
    private View view;
    
    public Controller (Model m, View v) {
        this.model = m;
        this.view = v;
    }
    
        public void board (ArrayList<String> origin, String entity) {
        
        if (model.getSpaceship().size() < 3){
            origin.remove(entity);
            model.getSpaceship().add(entity);
            System.out.println("Added " + entity + " at index " + model.getSpaceship().size());
        } 
        else if (model.getSpaceship().size() == 3)
            System.out.println("Spaceship is full!");
       
    }
    
    public void launch (ArrayList<String> origin, ArrayList<String> spaceship, ArrayList<String> destination) {
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
        
        if (!planet.contains("Scientist")) {
            
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
    
}
