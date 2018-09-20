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
public class Cuenta {
    private int numeroc;
    private double saldoc;
    private String fechac;
    private String nomCliente;
    private Movimiento[]m;

    public Cuenta(int numeroc, double saldoc, String fechac, String nomCliente, Movimiento m) {
        this.numeroc = numeroc;
        this.saldoc = saldoc;
        this.fechac = fechac;
        this.nomCliente = nomCliente;
        this.m = new Movimiento [10];
        hacermov(m);
    }
    public boolean hacermov(Movimiento mov) {
        for (int i = 0; i < this.m.length; i++) {
            if (this.m[i] == null) {
                this.m[i] = mov;
                return true;
            }
        }
        return false;
    }
  

    public int getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(int numeroc) {
        this.numeroc = numeroc;
    }

    public double getSaldoc() {
        return saldoc;
    }

    public void setSaldoc(double saldoc) {
        this.saldoc = saldoc;
    }

    public String getFechac() {
        return fechac;
    }

    public void setFechac(String fechac) {
        this.fechac = fechac;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }
    
 @Override
    public String toString() {
        String printBoard = "\n" + "\n cuenta : " + numeroc + "\n Nombre: "+nomCliente+"\n saldo de la cuenta: " + saldoc+ "\n fecha creacion:" +fechac+"saldo: "+ saldoc+m;     
       int a;
       for (int i = 0; i < 10; i++) {
            if (m[i] != null) {
                printBoard += "\n  movimiento " + (a = i + 1) + m[i].toString();
            }

        }
        return printBoard;
    }

}
    

