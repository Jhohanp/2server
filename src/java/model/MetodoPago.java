/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO
 */
public class MetodoPago {
    String Nombre, Digitos;

    public MetodoPago(String Nombre, String Digitos) {
        this.Nombre = Nombre;
        this.Digitos = Digitos;
    }

    public MetodoPago() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDigitos() {
        return Digitos;
    }

    public void setDigitos(String Digitos) {
        this.Digitos = Digitos;
    }
    
}
