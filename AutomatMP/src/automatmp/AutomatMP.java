/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatmp;

/**
 *
 * @author User
 */
public class AutomatMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View(m);
        
        v.setVisible(true);
        
//        // TODO code application logic here
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
    }
    
}
