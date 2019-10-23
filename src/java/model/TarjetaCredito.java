/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author white
 */
public class TarjetaCredito {
    
    private String Tipo;
    private int Digitos,Cupo,Cuota;
    private double Interes;

    public TarjetaCredito() {
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getDigitos() {
        return Digitos;
    }

    public void setDigitos(int Digitos) {
        this.Digitos = Digitos;
    }

    public int getCupo() {
        return Cupo;
    }

    public void setCupo(int Cupo) {
        this.Cupo = Cupo;
    }

    public int getCuota() {
        return Cuota;
    }

    public void setCuota(int Cuota) {
        this.Cuota = Cuota;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }
    
    

}