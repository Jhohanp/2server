/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iDAO;

import java.sql.SQLException;
import java.util.List;
 
 
public interface IBaseDatos <T> {	
	public List<T> BuscarTodo() throws SQLException;
        public boolean insertar(T t) throws SQLException;
	public boolean actualizar(T t) throws SQLException;
	public boolean eliminar(T t) throws SQLException;
}