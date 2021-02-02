/*
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package gal.teis;

import java.util.ArrayList;

/**
 * @author Esther Ferreiro
 * Imprime en pantalla un menú a partir dun ArrayList de String que conten as
 * opcións do menú.
 * Permite facer un control de rango da opción del menú que se introduce
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
