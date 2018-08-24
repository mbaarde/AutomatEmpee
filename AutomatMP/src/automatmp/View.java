/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class View extends javax.swing.JFrame {
    
    private int ctr = 0;
    private BFS bfs;
    //assume user's starting position is at 0 (on Earth with no moves)
    private int pos = 0;
    
    public void transport(ArrayList<String> spaceship, ArrayList<Node> nodes){
        ArrayList<String> tempship = spaceship;
        ArrayList<Node> tempnode = nodes;
        
        String transitionStatement = "";
        for(int i = 0; i < tempship.size(); i++){
            transitionStatement += tempship.get(i).charAt(0);
        }
        
        if(tempship.contains("Scientist")){
            if(pos == 0 && transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CLS");
                System.out.println("Current Pos: " + 1);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos++;
                
            }else if(pos == 1 && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CS");
                System.out.println("Current Pos: " + 2);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000010.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 2;
            }else if(pos == 1 && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("C") && !transitionStatement.contains("H") && !transitionStatement.contains("G")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LS");
                System.out.println("Current Pos: " + 7);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000100.png")));
                
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 7;
            } else if(pos == 1 && transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CLS");
                System.out.println("Current Pos: " + 0);
                pos = 0;
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/start.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
            }else if(pos == 2 && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CS");
                System.out.println("Current Pos: " + 1);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 1;
            } else if(pos == 2 && transitionStatement.contains("C") && transitionStatement.contains("G") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CGS");
                System.out.println("Current Pos: " + 3);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/001111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsGrain.setOpaque(true);
                marsGrain.setContentAreaFilled(true);
                marsGrain.setBorderPainted(true);
                marsGrain.setText("Grain");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 3;
            } else if(pos == 2 && transitionStatement.contains("C") && transitionStatement.contains("H") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 11);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 11;
            } else if(pos == 2 && transitionStatement.contains("C") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 11);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 11;
            }else if(pos == 3 && transitionStatement.contains("C") && transitionStatement.contains("G") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CGS");
                System.out.println("Current Pos: " + 2);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000010.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthGrain.setOpaque(true);
                earthGrain.setContentAreaFilled(true);
                earthGrain.setBorderPainted(true);
                earthGrain.setText("Grain");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 2;
            }else if(pos == 3 && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CS");
                System.out.println("Current Pos: " + 4);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/001010.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 4;
            }else if(pos == 3 && transitionStatement.contains("G") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("H") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "GLS");
                System.out.println("Current Pos: " + 7);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000100.png")));
                
                earthGrain.setOpaque(true);
                earthGrain.setContentAreaFilled(true);
                earthGrain.setBorderPainted(true);
                earthGrain.setText("Grain");
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 7;
            }else if(pos == 4 && transitionStatement.contains("H") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("C") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HHS");
                System.out.println("Current Pos: " + 5);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111011.png")));
                
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 5;
            }else if(pos == 4 && transitionStatement.contains("C") && transitionStatement.contains("H") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("E") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 13);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011111.png")));
                
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 13;
            }else if(pos == 4 && transitionStatement.contains("C") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 13);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011111.png")));
                
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 13;
            }else if(pos == 4 && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CS");
                System.out.println("Current Pos: " + 3);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/001111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 3;
            }else if(pos == 7 && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LS");
                System.out.println("Current Pos: " + 1);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000111.png")));
                
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 1;
            }else if(pos == 7 && transitionStatement.contains("L") && transitionStatement.contains("G") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("H") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LGS");
                System.out.println("Current Pos: " + 3);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/001111.png")));
                
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsGrain.setOpaque(true);
                marsGrain.setContentAreaFilled(true);
                marsGrain.setBorderPainted(true);
                marsGrain.setText("Grain");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 3;
            }else if(pos == 7 && transitionStatement.contains("L") && transitionStatement.contains("H") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HLS");
                System.out.println("Current Pos: " + 11);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010111.png")));
                
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 11;
            }else if(pos == 7 && transitionStatement.contains("L") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HLS");
                System.out.println("Current Pos: " + 11);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010111.png")));
                
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Savage(H)");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 11;
            }else if(pos == 7 && transitionStatement.contains("H") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("L") && !transitionStatement.contains("G") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HHS");
                System.out.println("Current Pos: " + 8);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110101.png")));
                
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 8;
            }else if(pos == 11 && transitionStatement.contains("C") && transitionStatement.contains("H") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 2);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000010.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 2;
            }else if(pos == 11 && transitionStatement.contains("C") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("L")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CHS");
                System.out.println("Current Pos: " + 2);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000010.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage(H)");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 2;
            }else if(pos == 11 && transitionStatement.contains("L") && transitionStatement.contains("H") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LHS");
                System.out.println("Current Pos: " + 7);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000100.png")));
                
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Cow");
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 7;
            }else if(pos == 11 && transitionStatement.contains("L") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LHS");
                System.out.println("Current Pos: " + 7);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000100.png")));
                
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Cow");
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 7;
            }else if(pos == 11 && transitionStatement.contains("L") && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "LCS");
                System.out.println("Current Pos: " + 12);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010000.png")));
                
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 12;
            }else if(pos == 12 && transitionStatement.contains("H") && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("L") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HCS");
                System.out.println("Current Pos: " + 8);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 8;
            }else if(pos == 12 && transitionStatement.contains("E") && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("L") && !transitionStatement.contains("G") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HCS");
                System.out.println("Current Pos: " + 8);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 8;
            }else if(pos == 12 && transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CLS");
                System.out.println("Current Pos: " + 11);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 11;
            }else if(pos == 8 && transitionStatement.contains("H") && transitionStatement.contains("E") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("L") && !transitionStatement.contains("C")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HHS");
                System.out.println("Current Pos: " + 7);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/000100.png")));
                
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 7;
            }else if(pos == 8 && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("E") && !transitionStatement.contains("G") && !transitionStatement.contains("L") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "CS");
                System.out.println("Current Pos: " + 9);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110000.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 9;
            }else if(pos == 8 && transitionStatement.contains("H") && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("L") && !transitionStatement.contains("E")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HCS");
                System.out.println("Current Pos: " + 12);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010000.png")));
                
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 12;
            }else if(pos == 8 && transitionStatement.contains("E") && transitionStatement.contains("C") && transitionStatement.contains("S") && !transitionStatement.contains("G") && !transitionStatement.contains("L") && !transitionStatement.contains("H")){
                System.out.println("Previous Pos: " + pos);
                System.out.println("Transition Statement: " + "HCS");
                System.out.println("Current Pos: " + 12);
                
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/010000.png")));
                
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage(H)");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 12;
            }else if(pos == 14 && transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011111.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 13;
                
            }
            else if(pos == 14 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && transitionStatement.contains("H") && !transitionStatement.contains("G")&& !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111011.png")));
                
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 5;
                
            }
            else if(pos == 14 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G")&& transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111011.png")));
                
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 5;
                
            }
            else if(pos == 14 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsHuman.setOpaque(true);
                marsHuman.setContentAreaFilled(true);
                marsHuman.setBorderPainted(true);
                marsHuman.setText("Human");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 10;
                
            }
            else if(pos == 14 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsSavage.setOpaque(true);
                marsSavage.setContentAreaFilled(true);
                marsSavage.setBorderPainted(true);
                marsSavage.setText("Savage(H)");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 10;
                
            }
            else if(pos == 5 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011000.png")));
                
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 14;
                
            }
            else if(pos == 5 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011000.png")));
                
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage(H)");
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 14;
                
            }
            else if(pos == 5 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111000.png")));
                
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 6;
                
            }
            else if(pos == 5 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110000.png")));
                
                earthGrain.setOpaque(true);
                earthGrain.setContentAreaFilled(true);
                earthGrain.setBorderPainted(true);
                earthGrain.setText("Grain");
                earthLion.setOpaque(true);
                earthLion.setContentAreaFilled(true);
                earthLion.setBorderPainted(true);
                earthLion.setText("Lion");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 9;
                
            }
            else if(pos == 5 && !transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && transitionStatement.contains("H") && !transitionStatement.contains("G")& transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/001010.png")));
                
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage(H)");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 4;
                
            }
            else if(pos == 9 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 8;
                
            }
            else if(pos == 9 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111101.png")));
                
                marsGrain.setOpaque(true);
                marsGrain.setContentAreaFilled(true);
                marsGrain.setBorderPainted(true);
                marsGrain.setText("Grain");
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 10;
                
            }
            else if(pos == 9 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111011.png")));
                
                marsGrain.setOpaque(true);
                marsGrain.setContentAreaFilled(true);
                marsGrain.setBorderPainted(true);
                marsGrain.setText("Grain");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 5;
                
            }
            else if(pos == 10 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/110000.png")));
                
                earthGrain.setOpaque(true);
                earthGrain.setContentAreaFilled(true);
                earthGrain.setBorderPainted(true);
                earthGrain.setText("Grain");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketGrain.setOpaque(false);
                rocketGrain.setContentAreaFilled(false);
                rocketGrain.setBorderPainted(false);
                rocketGrain.setText("");
                rocketGrain.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 9;
                
            }
            else if(pos == 10 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011000.png")));
                
                earthHuman.setOpaque(true);
                earthHuman.setContentAreaFilled(true);
                earthHuman.setBorderPainted(true);
                earthHuman.setText("Human");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketHuman.setOpaque(false);
                rocketHuman.setContentAreaFilled(false);
                rocketHuman.setBorderPainted(false);
                rocketHuman.setText("");
                rocketHuman.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 14;
                
            }
            else if(pos == 10 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/011000.png")));
                
                earthSavage.setOpaque(true);
                earthSavage.setContentAreaFilled(true);
                earthSavage.setBorderPainted(true);
                earthSavage.setText("Savage(H)");
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketSavage.setOpaque(false);
                rocketSavage.setContentAreaFilled(false);
                rocketSavage.setBorderPainted(false);
                rocketSavage.setText("");
                rocketSavage.setBackground(rocketTransport.getBackground());
                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 14;
                
            }
            else if(pos == 10 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111000.png")));
                
                earthCow.setOpaque(true);
                earthCow.setContentAreaFilled(true);
                earthCow.setBorderPainted(true);
                earthCow.setText("Cow");
                earthScientist.setOpaque(true);
                earthScientist.setContentAreaFilled(true);
                earthScientist.setBorderPainted(true);
                earthScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 6;
                
            }
            else if(pos == 6 && !transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111011.png")));


                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 5;
                
            }
            else if(pos == 6 && transitionStatement.contains("C") && !transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/111101.png")));
                
                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 10;
                
            }
            else if(pos == 6 && transitionStatement.contains("C") && transitionStatement.contains("L") && transitionStatement.contains("S") && !transitionStatement.contains("H") && !transitionStatement.contains("G") && !transitionStatement.contains("E")){
                System.out.println("Current Pos: " + pos);
                stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/win.png")));

                marsCow.setOpaque(true);
                marsCow.setContentAreaFilled(true);
                marsCow.setBorderPainted(true);
                marsCow.setText("Cow");
                marsLion.setOpaque(true);
                marsLion.setContentAreaFilled(true);
                marsLion.setBorderPainted(true);
                marsLion.setText("Lion");
                marsScientist.setOpaque(true);
                marsScientist.setContentAreaFilled(true);
                marsScientist.setBorderPainted(true);
                marsScientist.setText("Scientist");

                rocketCow.setOpaque(false);
                rocketCow.setContentAreaFilled(false);
                rocketCow.setBorderPainted(false);
                rocketCow.setText("");
                rocketCow.setBackground(rocketTransport.getBackground());
                rocketLion.setOpaque(false);
                rocketLion.setContentAreaFilled(false);
                rocketLion.setBorderPainted(false);
                rocketLion.setText("");
                rocketLion.setBackground(rocketTransport.getBackground());
                rocketScientist.setOpaque(false);
                rocketScientist.setContentAreaFilled(false);
                rocketScientist.setBorderPainted(false);
                rocketScientist.setText("");
                rocketScientist.setBackground(rocketTransport.getBackground());
                
                pos = 15;
                JOptionPane.showMessageDialog(null, "YOU HAVE WONNED", "CONGRATULATIONS", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "YOU HAVE LOSS", "xD", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
        
        tempship.clear();
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
    
    private Model model;
    /**
     * Creates new form View
     */
    public View(Model m) {
        model = m;
        initComponents();
        inviRocketMars();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void inviRocketMars(){
        
        //Mars
        marsGrain.setOpaque(false);
        marsGrain.setContentAreaFilled(false);
        marsGrain.setBorderPainted(false);
        marsGrain.setText("");
        marsGrain.setEnabled(false);
        
        marsCow.setOpaque(false);
        marsCow.setContentAreaFilled(false);
        marsCow.setBorderPainted(false);
        marsCow.setText("");
        marsCow.setEnabled(false);
        
        marsLion.setOpaque(false);
        marsLion.setContentAreaFilled(false);
        marsLion.setBorderPainted(false);
        marsLion.setText("");
        marsLion.setEnabled(false);
        
        marsHuman.setOpaque(false);
        marsHuman.setContentAreaFilled(false);
        marsHuman.setBorderPainted(false);
        marsHuman.setText("");
        marsHuman.setEnabled(false);
        
        marsSavage.setOpaque(false);
        marsSavage.setContentAreaFilled(false);
        marsSavage.setBorderPainted(false);
        marsSavage.setText("");
        marsSavage.setEnabled(false);
        
        marsScientist.setOpaque(false);
        marsScientist.setContentAreaFilled(false);
        marsScientist.setBorderPainted(false);
        marsScientist.setText("");
        marsScientist.setEnabled(false);
        
        //Rocket
        rocketGrain.setOpaque(false);
        rocketGrain.setContentAreaFilled(false);
        rocketGrain.setBorderPainted(false);
        rocketGrain.setText("");
        
        rocketCow.setOpaque(false);
        rocketCow.setContentAreaFilled(false);
        rocketCow.setBorderPainted(false);
        rocketCow.setText("");
        
        rocketLion.setOpaque(false);
        rocketLion.setContentAreaFilled(false);
        rocketLion.setBorderPainted(false);
        rocketLion.setText("");
        
        rocketHuman.setOpaque(false);
        rocketHuman.setContentAreaFilled(false);
        rocketHuman.setBorderPainted(false);
        rocketHuman.setText("");
        
        rocketSavage.setOpaque(false);
        rocketSavage.setContentAreaFilled(false);
        rocketSavage.setBorderPainted(false);
        rocketSavage.setText("");
        
        rocketScientist.setOpaque(false);
        rocketScientist.setContentAreaFilled(false);
        rocketScientist.setBorderPainted(false);
        rocketScientist.setText("");
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Mars = new javax.swing.JLabel();
        earthPanel = new javax.swing.JPanel();
        earthGrain = new javax.swing.JButton();
        earthLion = new javax.swing.JButton();
        earthCow = new javax.swing.JButton();
        earthScientist = new javax.swing.JButton();
        earthSavage = new javax.swing.JButton();
        earthHuman = new javax.swing.JButton();
        Earth = new javax.swing.JLabel();
        rocketTransport = new javax.swing.JButton();
        rocketPanel = new javax.swing.JPanel();
        rocketGrain = new javax.swing.JButton();
        rocketLion = new javax.swing.JButton();
        rocketCow = new javax.swing.JButton();
        rocketHuman = new javax.swing.JButton();
        rocketSavage = new javax.swing.JButton();
        rocketScientist = new javax.swing.JButton();
        Rocket = new javax.swing.JLabel();
        marsPanel = new javax.swing.JPanel();
        marsGrain = new javax.swing.JButton();
        marsLion = new javax.swing.JButton();
        marsCow = new javax.swing.JButton();
        marsScientist = new javax.swing.JButton();
        marsSavage = new javax.swing.JButton();
        marsHuman = new javax.swing.JButton();
        stateBG = new javax.swing.JLabel();
        othersPanel = new javax.swing.JPanel();
        solutionToggle = new javax.swing.JToggleButton();
        buttonHint = new javax.swing.JButton();
        Others = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Game");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Mars.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mars.setText("Mars:");

        earthGrain.setText("Grain");
        earthGrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthGrainActionPerformed(evt);
            }
        });

        earthLion.setText("Lion");
        earthLion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthLionActionPerformed(evt);
            }
        });

        earthCow.setText("Cow");
        earthCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthCowActionPerformed(evt);
            }
        });

        earthScientist.setText("Scientist");
        earthScientist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthScientistActionPerformed(evt);
            }
        });

        earthSavage.setText("Savage(H)");
        earthSavage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthSavageActionPerformed(evt);
            }
        });

        earthHuman.setText("Human");
        earthHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthHumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout earthPanelLayout = new javax.swing.GroupLayout(earthPanel);
        earthPanel.setLayout(earthPanelLayout);
        earthPanelLayout.setHorizontalGroup(
            earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(earthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(earthGrain, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(earthLion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(earthCow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(earthScientist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(earthSavage, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(earthHuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        earthPanelLayout.setVerticalGroup(
            earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(earthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(earthGrain)
                    .addComponent(earthHuman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(earthLion)
                    .addComponent(earthSavage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(earthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(earthCow)
                    .addComponent(earthScientist))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Earth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Earth.setText("Earth:");

        rocketTransport.setText("Transport");
        rocketTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketTransportActionPerformed(evt);
            }
        });

        rocketGrain.setText("Grain");
        rocketGrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketGrainActionPerformed(evt);
            }
        });

        rocketLion.setText("Lion");
        rocketLion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketLionActionPerformed(evt);
            }
        });

        rocketCow.setText("Cow");
        rocketCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketCowActionPerformed(evt);
            }
        });

        rocketHuman.setText("Human");
        rocketHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketHumanActionPerformed(evt);
            }
        });

        rocketSavage.setText("Savage(H)");
        rocketSavage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketSavageActionPerformed(evt);
            }
        });

        rocketScientist.setText("Scientist");
        rocketScientist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rocketScientistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rocketPanelLayout = new javax.swing.GroupLayout(rocketPanel);
        rocketPanel.setLayout(rocketPanelLayout);
        rocketPanelLayout.setHorizontalGroup(
            rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rocketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rocketCow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rocketLion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rocketGrain, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rocketSavage, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(rocketHuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rocketScientist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rocketPanelLayout.setVerticalGroup(
            rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rocketPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rocketGrain)
                    .addComponent(rocketHuman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rocketLion)
                    .addComponent(rocketSavage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rocketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rocketCow)
                    .addComponent(rocketScientist))
                .addContainerGap())
        );

        Rocket.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rocket.setText("Rocket:");

        marsGrain.setText("Grain");
        marsGrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsGrainActionPerformed(evt);
            }
        });

        marsLion.setText("Lion");
        marsLion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsLionActionPerformed(evt);
            }
        });

        marsCow.setText("Cow");
        marsCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsCowActionPerformed(evt);
            }
        });

        marsScientist.setText("Scientist");
        marsScientist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsScientistActionPerformed(evt);
            }
        });

        marsSavage.setText("Savage(H)");
        marsSavage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsSavageActionPerformed(evt);
            }
        });

        marsHuman.setText("Human");
        marsHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsHumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout marsPanelLayout = new javax.swing.GroupLayout(marsPanel);
        marsPanel.setLayout(marsPanelLayout);
        marsPanelLayout.setHorizontalGroup(
            marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(marsGrain, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(marsLion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marsCow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marsScientist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marsSavage, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(marsHuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        marsPanelLayout.setVerticalGroup(
            marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marsGrain)
                    .addComponent(marsHuman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marsLion)
                    .addComponent(marsSavage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(marsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marsScientist)
                    .addComponent(marsCow))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/start.png"))); // NOI18N

        solutionToggle.setText("Solution");
        solutionToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionToggleActionPerformed(evt);
            }
        });

        buttonHint.setText("Hint");
        buttonHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout othersPanelLayout = new javax.swing.GroupLayout(othersPanel);
        othersPanel.setLayout(othersPanelLayout);
        othersPanelLayout.setHorizontalGroup(
            othersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(othersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(solutionToggle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(buttonHint)
                .addContainerGap())
        );
        othersPanelLayout.setVerticalGroup(
            othersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(othersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(othersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solutionToggle)
                    .addComponent(buttonHint))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Others.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Others.setText("Others:");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateBG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(earthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(rocketPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Earth)
                        .addGap(250, 250, 250)
                        .addComponent(Rocket)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Mars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Others)
                        .addGap(90, 90, 90))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(marsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(othersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(rocketTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateBG)
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mars)
                    .addComponent(Rocket)
                    .addComponent(Others)
                    .addComponent(Earth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rocketPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(earthPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(othersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rocketTransport)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rocketTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketTransportActionPerformed
        // TODO add your handling code here:
        
        ctr++;
        
        //This one determines the rocket placement if it is on Earth or on Mars
        if(ctr%2 == 1){
            earthGrain.setEnabled(false);
            earthLion.setEnabled(false);
            earthCow.setEnabled(false);
            earthSavage.setEnabled(false);
            earthHuman.setEnabled(false);
            earthScientist.setEnabled(false);
            
            marsGrain.setEnabled(true);
            marsLion.setEnabled(true);
            marsCow.setEnabled(true);
            marsSavage.setEnabled(true);
            marsHuman.setEnabled(true);
            marsScientist.setEnabled(true);
        } else if(ctr%2 == 0){
            earthGrain.setEnabled(true);
            earthLion.setEnabled(true);
            earthCow.setEnabled(true);
            earthSavage.setEnabled(true);
            earthHuman.setEnabled(true);
            earthScientist.setEnabled(true);
            
            marsGrain.setEnabled(false);
            marsLion.setEnabled(false);
            marsCow.setEnabled(false);
            marsSavage.setEnabled(false);
            marsHuman.setEnabled(false);
            marsScientist.setEnabled(false);
        }
        
        transport(model.getSpaceship(), model.getNodes());
        
        //Apply controller/model checking of every panel here:
        
        /*
        For copy paste references:
        
        //Panels:
        earthPanel
        rocketPanel
        marsPanel
        othersPanel
        
        //Buttons:
        //Earth:
        earthGrain
        earthCow
        earthLion
        earthHuman
        earthSavage
        earthScientist
        //Rocket:
        rocketGrain
        rocketCow
        rocketLion
        rocketHuman
        rocketSavage
        rocketScientist
        //Mars:
        marsGrain
        marsCow
        marsLion
        marsHuman
        marsSavage
        marsScientist
        
        //Others:
        rocketTransport
        othersPanel
        solutionToggle
        buttonHint
        stateBG
        
        */
    }//GEN-LAST:event_rocketTransportActionPerformed

    private void earthGrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthGrainActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Grain");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthGrain.setOpaque(false);
            earthGrain.setContentAreaFilled(false);
            earthGrain.setBorderPainted(false);
            earthGrain.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketGrain.setOpaque(true);
            rocketGrain.setContentAreaFilled(true);
            rocketGrain.setBorderPainted(true);
            rocketGrain.setText("Grain");
            rocketGrain.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthGrainActionPerformed

    private void earthLionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthLionActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Lion");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthLion.setOpaque(false);
            earthLion.setContentAreaFilled(false);
            earthLion.setBorderPainted(false);
            earthLion.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketLion.setOpaque(true);
            rocketLion.setContentAreaFilled(true);
            rocketLion.setBorderPainted(true);
            rocketLion.setText("Lion");
            rocketLion.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthLionActionPerformed

    private void earthCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthCowActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Cow");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthCow.setOpaque(false);
            earthCow.setContentAreaFilled(false);
            earthCow.setBorderPainted(false);
            earthCow.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketCow.setOpaque(true);
            rocketCow.setContentAreaFilled(true);
            rocketCow.setBorderPainted(true);
            rocketCow.setText("Cow");
            rocketCow.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthCowActionPerformed

    private void earthScientistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthScientistActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Scientist");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthScientist.setOpaque(false);
            earthScientist.setContentAreaFilled(false);
            earthScientist.setBorderPainted(false);
            earthScientist.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketScientist.setOpaque(true);
            rocketScientist.setContentAreaFilled(true);
            rocketScientist.setBorderPainted(true);
            rocketScientist.setText("Scientist");
            rocketScientist.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthScientistActionPerformed

    private void marsGrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsGrainActionPerformed
        // TODO add your handling code here:
        
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Grain");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsGrain.setOpaque(false);
            marsGrain.setContentAreaFilled(false);
            marsGrain.setBorderPainted(false);
            marsGrain.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketGrain.setOpaque(true);
            rocketGrain.setContentAreaFilled(true);
            rocketGrain.setBorderPainted(true);
            rocketGrain.setText("Grain");
            rocketGrain.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsGrainActionPerformed

    private void marsLionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsLionActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Lion");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsLion.setOpaque(false);
            marsLion.setContentAreaFilled(false);
            marsLion.setBorderPainted(false);
            marsLion.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketLion.setOpaque(true);
            rocketLion.setContentAreaFilled(true);
            rocketLion.setBorderPainted(true);
            rocketLion.setText("Lion");
            rocketLion.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsLionActionPerformed

    private void marsCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsCowActionPerformed
        // TODO add your handling code here:
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Cow");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsCow.setOpaque(false);
            marsCow.setContentAreaFilled(false);
            marsCow.setBorderPainted(false);
            marsCow.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketCow.setOpaque(true);
            rocketCow.setContentAreaFilled(true);
            rocketCow.setBorderPainted(true);
            rocketCow.setText("Cow");
            rocketCow.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsCowActionPerformed

    private void marsScientistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsScientistActionPerformed
        // TODO add your handling code here:
        
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Scientist");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsScientist.setOpaque(false);
            marsScientist.setContentAreaFilled(false);
            marsScientist.setBorderPainted(false);
            marsScientist.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketScientist.setOpaque(true);
            rocketScientist.setContentAreaFilled(true);
            rocketScientist.setBorderPainted(true);
            rocketScientist.setText("Scientist");
            rocketScientist.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsScientistActionPerformed

    private void rocketHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketHumanActionPerformed
        // TODO add your handling code here:
        
        //Save the BG Color of current Grain button here.
        Color c = rocketHuman.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Human");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Human" button of Earth to be visible, then makes the "Human" button on Rocket to disappear.
            rocketHuman.setOpaque(false);
            rocketHuman.setContentAreaFilled(false);
            rocketHuman.setBorderPainted(false);
            rocketHuman.setText("");
            
            //Reverts the BG of the button back to default.
            rocketHuman.setBackground(solutionToggle.getBackground());

            earthHuman.setOpaque(true);
            earthHuman.setContentAreaFilled(true);
            earthHuman.setBorderPainted(true);
            earthHuman.setText("Human");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Human" button of Mars to be visible, then makes the "Human" button on Rocket to disappear.
            rocketHuman.setOpaque(false);
            rocketHuman.setContentAreaFilled(false);
            rocketHuman.setBorderPainted(false);
            rocketHuman.setText("");
            
            //Reverts the BG of the button back to default.
            rocketHuman.setBackground(solutionToggle.getBackground());

            earthHuman.setOpaque(true);
            earthHuman.setContentAreaFilled(true);
            earthHuman.setBorderPainted(true);
            earthHuman.setText("Human");
        }
    }//GEN-LAST:event_rocketHumanActionPerformed

    private void solutionToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionToggleActionPerformed
        // TODO add your handling code here:
        if(solutionToggle.isSelected()){
            bfs = new BFS(model);
            stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/statemapsolution.png")));
        }else 
            stateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/start.png")));
            
    }//GEN-LAST:event_solutionToggleActionPerformed

    private void buttonHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHintActionPerformed
        // TODO add your handling code here:
        
        //Idea here is to disable it when one ViewHint window is opened.
        //We can disable it muna up until user clicks "Back to Game" in the other frame
        //buttonHint.setEnabled(false);
        
        //Opening new frame called "HintView" to view the hint.
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HintView().setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonHintActionPerformed

    private void earthHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthHumanActionPerformed
        // TODO add your handling code here:
        
        if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Human");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthHuman.setOpaque(false);
            earthHuman.setContentAreaFilled(false);
            earthHuman.setBorderPainted(false);
            earthHuman.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketHuman.setOpaque(true);
            rocketHuman.setContentAreaFilled(true);
            rocketHuman.setBorderPainted(true);
            rocketHuman.setText("Human");
            rocketHuman.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthHumanActionPerformed

    private void earthSavageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthSavageActionPerformed
        // TODO add your handling code here:
        
       if(model.getSpaceship().size() < 3){
            this.board(model.getEarth(), "Erectus");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            earthSavage.setOpaque(false);
            earthSavage.setContentAreaFilled(false);
            earthSavage.setBorderPainted(false);
            earthSavage.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketSavage.setOpaque(true);
            rocketSavage.setContentAreaFilled(true);
            rocketSavage.setBorderPainted(true);
            rocketSavage.setText("Savage(H)");
            rocketSavage.setBackground(Color.GREEN);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_earthSavageActionPerformed

    private void rocketGrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketGrainActionPerformed
        // TODO add your handling code here.
        
        //Save the BG Color of current Grain button here.
        Color c = rocketGrain.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Grain");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Grain" button of Earth to be visible, then makes the "Grain" button on Rocket to disappear.
            rocketGrain.setOpaque(false);
            rocketGrain.setContentAreaFilled(false);
            rocketGrain.setBorderPainted(false);
            rocketGrain.setText("");
            
            //Reverts the BG of the button back to default.
            rocketGrain.setBackground(solutionToggle.getBackground());

            earthGrain.setOpaque(true);
            earthGrain.setContentAreaFilled(true);
            earthGrain.setBorderPainted(true);
            earthGrain.setText("Grain");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Grain" button of Mars to be visible, then makes the "Grain" button on Rocket to disappear.
            rocketGrain.setOpaque(false);
            rocketGrain.setContentAreaFilled(false);
            rocketGrain.setBorderPainted(false);
            rocketGrain.setText("");
            
            //Reverts the BG of the button back to default.
            rocketGrain.setBackground(solutionToggle.getBackground());

            earthGrain.setOpaque(true);
            earthGrain.setContentAreaFilled(true);
            earthGrain.setBorderPainted(true);
            earthGrain.setText("Grain");
        }
    }//GEN-LAST:event_rocketGrainActionPerformed

    private void marsHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsHumanActionPerformed
        // TODO add your handling code here:
        
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Human");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsHuman.setOpaque(false);
            marsHuman.setContentAreaFilled(false);
            marsHuman.setBorderPainted(false);
            marsHuman.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketHuman.setOpaque(true);
            rocketHuman.setContentAreaFilled(true);
            rocketHuman.setBorderPainted(true);
            rocketHuman.setText("Human");
            rocketHuman.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsHumanActionPerformed

    private void marsSavageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsSavageActionPerformed
        // TODO add your handling code here:
        
        if(model.getSpaceship().size() < 3){
            this.board(model.getMars(), "Erectus");
            //This logic sets the "Grain" button of Earth to be invisible then makes the "Grain" button on Rocket to appear.
            marsSavage.setOpaque(false);
            marsSavage.setContentAreaFilled(false);
            marsSavage.setBorderPainted(false);
            marsSavage.setText("");

            //Earth's color is Green, that's why the BG is Green
            rocketSavage.setOpaque(true);
            rocketSavage.setContentAreaFilled(true);
            rocketSavage.setBorderPainted(true);
            rocketSavage.setText("Savage");
            rocketSavage.setBackground(Color.YELLOW);
        }else{
            JOptionPane.showMessageDialog(null, "Spaceship is full!", "WARNING!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_marsSavageActionPerformed

    private void rocketLionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketLionActionPerformed
        // TODO add your handling code here:
        
        //Save the BG Color of current Grain button here.
        Color c = rocketLion.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Lion");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Lion" button of Earth to be visible, then makes the "Lion" button on Rocket to disappear.
            rocketLion.setOpaque(false);
            rocketLion.setContentAreaFilled(false);
            rocketLion.setBorderPainted(false);
            rocketLion.setText("");
            
            //Reverts the BG of the button back to default.
            rocketLion.setBackground(solutionToggle.getBackground());

            earthLion.setOpaque(true);
            earthLion.setContentAreaFilled(true);
            earthLion.setBorderPainted(true);
            earthLion.setText("Lion");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Lion" button of Mars to be visible, then makes the "Lion" button on Rocket to disappear.
            rocketLion.setOpaque(false);
            rocketLion.setContentAreaFilled(false);
            rocketLion.setBorderPainted(false);
            rocketLion.setText("");
            
            //Reverts the BG of the button back to default.
            rocketLion.setBackground(solutionToggle.getBackground());

            earthLion.setOpaque(true);
            earthLion.setContentAreaFilled(true);
            earthLion.setBorderPainted(true);
            earthLion.setText("Lion");
        }
    }//GEN-LAST:event_rocketLionActionPerformed

    private void rocketCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketCowActionPerformed
        // TODO add your handling code here:
        
        //Save the BG Color of current Grain button here.
        Color c = rocketCow.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Cow");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Cow" button of Earth to be visible, then makes the "Cow" button on Rocket to disappear.
            rocketCow.setOpaque(false);
            rocketCow.setContentAreaFilled(false);
            rocketCow.setBorderPainted(false);
            rocketCow.setText("");
            
            //Reverts the BG of the button back to default.
            rocketCow.setBackground(solutionToggle.getBackground());

            earthCow.setOpaque(true);
            earthCow.setContentAreaFilled(true);
            earthCow.setBorderPainted(true);
            earthCow.setText("Cow");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Cow" button of Mars to be visible, then makes the "Cow" button on Rocket to disappear.
            rocketCow.setOpaque(false);
            rocketCow.setContentAreaFilled(false);
            rocketCow.setBorderPainted(false);
            rocketCow.setText("");
            
            //Reverts the BG of the button back to default.
            rocketCow.setBackground(solutionToggle.getBackground());

            earthCow.setOpaque(true);
            earthCow.setContentAreaFilled(true);
            earthCow.setBorderPainted(true);
            earthCow.setText("Cow");
        }
    }//GEN-LAST:event_rocketCowActionPerformed

    private void rocketSavageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketSavageActionPerformed
        // TODO add your handling code here:
        
        //Save the BG Color of current Grain button here.
        Color c = rocketSavage.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Erectus");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Savage" button of Earth to be visible, then makes the "Savage" button on Rocket to disappear.
            rocketSavage.setOpaque(false);
            rocketSavage.setContentAreaFilled(false);
            rocketSavage.setBorderPainted(false);
            rocketSavage.setText("");
            
            //Reverts the BG of the button back to default.
            rocketSavage.setBackground(solutionToggle.getBackground());

            earthSavage.setOpaque(true);
            earthSavage.setContentAreaFilled(true);
            earthSavage.setBorderPainted(true);
            earthSavage.setText("Savage(H)");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Savage" button of Mars to be visible, then makes the "Savage" button on Rocket to disappear.
            rocketSavage.setOpaque(false);
            rocketSavage.setContentAreaFilled(false);
            rocketSavage.setBorderPainted(false);
            rocketSavage.setText("");
            
            //Reverts the BG of the button back to default.
            rocketSavage.setBackground(solutionToggle.getBackground());

            earthSavage.setOpaque(true);
            earthSavage.setContentAreaFilled(true);
            earthSavage.setBorderPainted(true);
            earthSavage.setText("Savage(H)");
        }
    }//GEN-LAST:event_rocketSavageActionPerformed

    private void rocketScientistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rocketScientistActionPerformed
        // TODO add your handling code here:
        
        //Save the BG Color of current Grain button here.
        Color c = rocketScientist.getBackground();
        
        System.out.println(model.getSpaceship());
        model.getSpaceship().remove("Scientist");
        System.out.println(model.getSpaceship());
        
        //Compare current Grain bg color. If Green, send/return to Earth. if not, do Yellow which sends/return to Mars.
        if(c.equals(Color.GREEN)){
            
            //This logic sets the "Scientist" button of Earth to be visible, then makes the "Scientist" button on Rocket to disappear.
            rocketScientist.setOpaque(false);
            rocketScientist.setContentAreaFilled(false);
            rocketScientist.setBorderPainted(false);
            rocketScientist.setText("");
            
            //Reverts the BG of the button back to default.
            rocketScientist.setBackground(solutionToggle.getBackground());

            earthScientist.setOpaque(true);
            earthScientist.setContentAreaFilled(true);
            earthScientist.setBorderPainted(true);
            earthScientist.setText("Scientist");
        }
        else if(c.equals(Color.YELLOW)){
        
            //This logic sets the "Scientist" button of Mars to be visible, then makes the "Scientist" button on Rocket to disappear.
            rocketScientist.setOpaque(false);
            rocketScientist.setContentAreaFilled(false);
            rocketScientist.setBorderPainted(false);
            rocketScientist.setText("");
            
            //Reverts the BG of the button back to default.
            rocketScientist.setBackground(solutionToggle.getBackground());

            earthScientist.setOpaque(true);
            earthScientist.setContentAreaFilled(true);
            earthScientist.setBorderPainted(true);
            earthScientist.setText("Scientist");
        }
    }//GEN-LAST:event_rocketScientistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Earth;
    private javax.swing.JLabel Mars;
    private javax.swing.JLabel Others;
    private javax.swing.JLabel Rocket;
    private javax.swing.JButton buttonHint;
    private javax.swing.JButton earthCow;
    private javax.swing.JButton earthGrain;
    private javax.swing.JButton earthHuman;
    private javax.swing.JButton earthLion;
    private javax.swing.JPanel earthPanel;
    private javax.swing.JButton earthSavage;
    private javax.swing.JButton earthScientist;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton marsCow;
    private javax.swing.JButton marsGrain;
    private javax.swing.JButton marsHuman;
    private javax.swing.JButton marsLion;
    private javax.swing.JPanel marsPanel;
    private javax.swing.JButton marsSavage;
    private javax.swing.JButton marsScientist;
    private javax.swing.JPanel othersPanel;
    private javax.swing.JButton rocketCow;
    private javax.swing.JButton rocketGrain;
    private javax.swing.JButton rocketHuman;
    private javax.swing.JButton rocketLion;
    private javax.swing.JPanel rocketPanel;
    private javax.swing.JButton rocketSavage;
    private javax.swing.JButton rocketScientist;
    private javax.swing.JButton rocketTransport;
    private javax.swing.JToggleButton solutionToggle;
    private javax.swing.JLabel stateBG;
    // End of variables declaration//GEN-END:variables
}
