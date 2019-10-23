/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EfectivoDAO;
import DAO.TCDAO;
import DAO.TDDAO;
import DAO.gastoDAO;
import java.sql.SQLException;
import model.Efectivo;
import model.Gasto;
import model.TarjetaCredito;
import model.TarjetaDebito;

/**
 *
 * @author richa
 */
public class Main {
    public static void main (String [ ] args) throws SQLException {

        gastoDAO g = new gastoDAO();
        Gasto gas = new Gasto();
        gas.setCodGasto("29");
        gas.setCategoria("Otros Gastos");
        gas.setFecha("2019-10-25");
        gas.setHora("9:00:00");
        gas.setMetodoPago("efectivo");
        gas.setMontoGasto(15000);
        gas.setFrecDiaria(2);
        gas.setDescripcion("lolo");
        g.insertar(gas);
        

        /*Efectivo efec = new Efectivo();
        efec.setCodEfectivo(1);
        efec.setMonto(350000);
        efec.setFecha("2019-10-26");
        efec.setDescripcion("Sueldo del mes de septiembre");
        
        EfectivoDAO ef = new EfectivoDAO();
        ef.insertar(efec);
        

        TarjetaCredito tc = new TarjetaCredito();
        tc.setDigitos(2345);
        tc.setTipo("Mastercard");
        tc.setCupo(4500000);
        tc.setCuota(8500);
        tc.setInteres(2.1);
        TCDAO TC = new TCDAO();
        TC.insertar(tc);

      /*  TarjetaDebito td = new TarjetaDebito();
        td.setDigitos(4125);
        td.setTipo("Maestro");
        td.setDisponible(250000);
        td.setCuota(8000);
        TDDAO TD = new TDDAO();
        TD.insertar(td);*/
        }
}
