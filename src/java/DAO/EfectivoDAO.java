/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connection.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Efectivo;

/**
 *
 * @author LENOVO
 */
public class EfectivoDAO {
     public ArrayList<Efectivo> BuscarTodo() throws SQLException {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM efectivo ORDER BY ID";
		
		ArrayList<Efectivo> listaEfectivo= new ArrayList<Efectivo>();
		
		try {			
			co= conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Efectivo e=new Efectivo();
                
				e.setDescripcion(rs.getString(1));
				e.setFecha(rs.getString(2));
				e.setMonto(rs.getInt(3));
				
                                
				listaEfectivo.add(e);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EfectivoDAO, método obtener");
			e.printStackTrace();
		}
		
		return listaEfectivo;
	}

    
    public boolean insertar(Efectivo ef) throws SQLException {
        boolean registrar = false;
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO efectivo values ('"+ef.getCodEfectivo()+"','"+ef.getMonto()+"','"+ef.getFecha()+"','"+ef.getDescripcion()+"')";
		
		try {			
			con=conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EfectivoDAO, método registrar");
			e.printStackTrace();
		}
		return registrar;
    }

   
    public boolean actualizar(Efectivo ef) throws SQLException {
       Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE Efectivo SET Descripcion='"+ef.getDescripcion()+"', Fecha='"+ef.getFecha()+"', Monto='"+ef.getMonto()+"' WHERE CodEfectivo="+ef.getCodEfectivo();
		try {
			connect=conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EfectivoDAO, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
    }

    
    public boolean eliminar(Efectivo ef) throws SQLException {
        Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM Efectivo WHERE CodEfectivo="+ef.getCodEfectivo();
		try {
			connect=conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EfectivoDAO, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
    }
}
