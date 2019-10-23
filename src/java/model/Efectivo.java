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
public class Efectivo {
    private String Fecha, Descripcion;
    private int Monto,CodEfectivo;

    public Efectivo() {
    }

    public int getCodEfectivo() {
        return CodEfectivo;
    }

    public void setCodEfectivo(int CodEfectivo) {
        this.CodEfectivo = CodEfectivo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    
}
