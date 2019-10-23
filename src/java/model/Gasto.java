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
public class Gasto {
    
    
    private String CodGasto, Categoria, fecha, hora, metodoPago,Descripcion;
    private int MontoGasto, FrecDiaria;

    public Gasto(String CodGasto, String Categoria, String fecha, String hora, String metodoPago, String Descripcion, int MontoGasto, int FrecDiaria) {
        this.CodGasto = CodGasto;
        this.Categoria = Categoria;
        this.fecha = fecha;
        this.hora = hora;
        this.metodoPago = metodoPago;
        this.Descripcion = Descripcion;
        this.MontoGasto = MontoGasto;
        this.FrecDiaria = FrecDiaria;
    }

    public Gasto() {
    }


    

    public String getCodGasto() {
        return CodGasto;
    }

    public void setCodGasto(String CodGasto) {
        this.CodGasto = CodGasto;
    }

    public int getMontoGasto() {
        return MontoGasto;
    }

    public void setMontoGasto(int MontoGasto) {
        this.MontoGasto = MontoGasto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getFrecDiaria() {
        return FrecDiaria;
    }

    public void setFrecDiaria(int FrecDiaria) {
        this.FrecDiaria = FrecDiaria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
