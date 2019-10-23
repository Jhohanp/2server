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
public class TarjetaDebito {
  
    
   private String Tipo;
   private int Digitos,Disponible,Cuota;

    public TarjetaDebito() {
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

    public int getDisponible() {
        return Disponible;
    }

    public void setDisponible(int Disponible) {
        this.Disponible = Disponible;
    }

    public int getCuota() {
        return Cuota;
    }

    public void setCuota(int Cuota) {
        this.Cuota = Cuota;
    }

   

    
   
   
}
