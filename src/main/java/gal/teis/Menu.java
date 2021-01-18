/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Esther Ferreiro
 */
public class Menu {
    
    ArrayList<String> opciones = new ArrayList<String>();
    
    public Menu(ArrayList opciones){
        this.opciones = opciones;
    }
    

    /**
     * @param args the command line arguments
     */
    public void printMenu() {
        for (int i = 1; i <= opciones.size(); i++){
            System.out.println(i + ".- " + opciones.get(i-1));
        } 
    }

   
}
