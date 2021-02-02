/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gal.teis;

import java.util.ArrayList;

/**
 *
 * @author Esther   Ferreiro
 */
public class Menu {
    
    private ArrayList<String> opciones = new ArrayList<String>();
    private int numOpciones;
    
    public Menu(ArrayList opciones){
        this.opciones = opciones;
        this.numOpciones= opciones.size();
    }
    

    /**
     * Imprime o menú na pantalla
     */
    public void printMenu() {
        for (int i = 1; i <= opciones.size(); i++){
            System.out.println(i + ".- " + opciones.get(i-1));
        } 
    }
    
    /**
     * Comproba que un parámetro está dentro dun rango
     *
     * @param op int - valor a analizar como pertencente ou non ao rango de opcións do menú
     * @return boolean - true se está no rango e false en caso contrario
     */
    public boolean rango(byte op) {
        boolean enrango = true;
        if (op < 1 || op > numOpciones) {
            enrango = false;
            System.out.println("\tERRO: debe introducir un valor dentro do rango de números posibles. "
                    + "\n\t\tVolva a introducir un número: \n");
        }
        return enrango;
    }
}
