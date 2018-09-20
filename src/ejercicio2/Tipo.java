/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author sebas
 */
public class Tipo {
    private String clase;

    public Tipo(String clase) {
        this.clase = clase;
    }
    

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
     @Override
    public String toString() {
        String printBoard = "\n" + "tipo de movimiento "+clase;
        return printBoard;
    }

}
