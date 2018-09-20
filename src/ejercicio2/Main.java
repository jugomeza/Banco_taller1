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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tipo t1=new Tipo("Comercial");
        Tipo t2=new Tipo("Cheque");
        Movimiento compra=new Movimiento("30 sep 2020",2000000,100,t1);
        Movimiento venta=new Movimiento("4 ene 2018",7000000,400,t2);
        Cuenta c1=new Cuenta(123124,5000000,"20 dic 2018","Fernando Gonzalez",compra);
        Cuenta c2=new Cuenta(120174,3600000,"10 dic 2015","Oscar Romero",venta);
        System.out.println(c1);
        System.out.println(c2);
        
        
        // TODO code application logic here
    }
    
}
