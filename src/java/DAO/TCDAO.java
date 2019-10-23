/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author karlacaranton
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import connection.conexion; 
import iDAO.IBaseDatos;
import model.TarjetaCredito;
 
public class TCDAO implements IBaseDatos<TarjetaCredito> {	
	

	public boolean insertar(TarjetaCredito Tc) throws SQLException {
		boolean insertar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO tarjetacredito values ('"+Tc.getDigitos()+"','"+Tc.getTipo()+"','"+Tc.getCupo()+"','"+Tc.getCuota()+"','"+Tc.getInteres()+"')";
		
		try {			
			con=conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			insertar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase TCDAO, método registrar");
			e.printStackTrace();
		}
		return insertar;
	}
 
	
	public ArrayList<TarjetaCredito> BuscarTodo() throws SQLException {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM tarjetacredito ORDER BY ID";
		
		ArrayList<TarjetaCredito> listaTC= new ArrayList<TarjetaCredito>();
		
		try {			
			co= conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				TarjetaCredito i=new TarjetaCredito();
				i.setTipo(rs.getString(2));
				i.setCuota(rs.getInt(1));
				i.setCupo(rs.getInt(3));
                                i.setDigitos(rs.getInt(4));
                                i.setInteres(rs.getDouble(5));
                                
				listaTC.add(i);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase TCDAO, método obtener");
			e.printStackTrace();
		}
		
		return listaTC;
	}
 

	public boolean actualizar(TarjetaCredito tc) throws SQLException{
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE Ingreso SET Digitos='"+tc.getDigitos()+"', Tipo='"+tc.getTipo()+"', Cuota='"+tc.getCuota()+"', Cupo='"+tc.getCupo()+"', Interes='"+tc.getInteres()+"' WHERE Digitos="+tc.getDigitos();
		try {
			connect=conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase TCDAO, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 

	public boolean eliminar(TarjetaCredito tc) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM Ingreso WHERE Digitos="+tc.getDigitos();
		try {
			connect=conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase TCDAO, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
}
