/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cclearimage;

import cclearimage.gui.GUI;

/**
 *
 * @author Wessel
 */
public class CClearImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI gui = new GUI();
        gui.setSize(1280, 720);
        gui.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
    
}
