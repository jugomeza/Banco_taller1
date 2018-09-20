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
public class Movimiento {
    private String fecham;
    private double saldoA;
    private double cantidadm;
    private Tipo clase;

    public Movimiento(String fecham, double SaldoA, double cantidadm, Tipo c) {
        this.fecham = fecham;
        this.saldoA = SaldoA;
        this.cantidadm = cantidadm;
        this.clase=c;
    }

    public String getFecham() {
        return fecham;
    }

    public void setFecham(String fecham) {
        this.fecham = fecham;
    }

    public double getSaldoA() {
        return saldoA;
    }

    public void setSaldoA(double SaldoA) {
        this.saldoA = SaldoA;
    }

    public double getCantidadm() {
        return cantidadm;
    }

    public void setCantidadm(double cantidadm) {
        this.cantidadm = cantidadm;
    }
 @Override
    public String toString() {
        String printBoard = "\n" + "fecha del movimiento"+fecham+"\n Saldo anterior: "+saldoA+"\n Cantidad: "+cantidadm+clase;
        return printBoard;
    }
    
}
