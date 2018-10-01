package lets.develop.BpzCore.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lets.develop.BpzCore.entity.Proveedor;
import lets.develop.BpzCore.util.Conexion;


public class ProovedorDao {
	private PreparedStatement pr;
	private Connection cn;
	private ResultSet rs;
	
	public boolean insertar(Proveedor e) throws Exception {
		boolean flag = false;
		try {
	    cn=Conexion.abrirConexion();
        String sql = "INSERT INTO PROVEEDOR (nombre, estado) VALUES (?, ?)";
        pr= cn.prepareStatement(sql);
        pr = cn.prepareStatement(sql);
        pr.setString(1, e.getNombre().toUpperCase());
        pr.setString(2, e.getEstado());
        int filas = pr.executeUpdate();   
        
        if (filas == 1) {flag = true;}
        
		}catch(Exception ex) {
        System.out.println(ex.getMessage());
        }finally {
            pr.close();
            cn.close();
		}
		return flag;
	}
	
	
	public boolean actualizar(Proveedor e) throws SQLException{
		boolean flag=false;
		try {
		    cn = Conexion.abrirConexion();
			String sql = "UPDATE PROVEEDOR SET nombre=?, estado = ? WHERE id=?";
			pr= cn.prepareStatement(sql);
			pr.setString(1, e.getNombre().toUpperCase());
			pr.setString(2, e.getEstado());
			pr.setInt(3, e.getId());
			int filas = pr.executeUpdate();
			
			if(filas==1){
				flag=true;
			}
			
		} catch (Exception ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}finally {
            pr.close();
            cn.close();
		}
		return flag;	
	}
	
	public List<Proveedor> listar() throws SQLException{
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		try {
			cn = Conexion.abrirConexion();
			String sql = "SELECT * FROM PROVEEDOR";
			pr= cn.prepareStatement(sql);
			
			rs= pr.executeQuery();
			Proveedor objProveedor =null;
			
			while(rs.next()){
			
				objProveedor=new Proveedor();
				objProveedor.setId(rs.getInt("id"));
				objProveedor.setNombre(rs.getString("nombre"));
				objProveedor.setEstado(rs.getString("estado"));
				proveedores.add(objProveedor);			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
	            pr.close();
	            cn.close();
	            rs.close();
		}
		return proveedores;
	}
	
	public List<Proveedor> listar(String nombre) throws SQLException{
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		try {
			cn =Conexion.abrirConexion();
			String sql = "SELECT * FROM PROVEEDOR where nombre =? ORDER BY nombre";
            pr = cn.prepareStatement(sql);
            pr.setString(1, nombre);
			rs= pr.executeQuery();
			Proveedor objProveedor =null;
			
			while(rs.next()){
			
				objProveedor=new Proveedor();
				objProveedor.setId(rs.getInt("id"));
				objProveedor.setNombre(rs.getString("nombre"));
				objProveedor.setEstado(rs.getString("estado"));
				proveedores.add(objProveedor);			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
            pr.close();
            cn.close();
            rs.close();
	}
		return proveedores;
	}
	
	public boolean eliminar(int proveedorId) throws SQLException{
		boolean flag = false;
		try {
			cn = Conexion.abrirConexion();
			String sql = "UPDATE PROVEEDOR set estado = 'INA' WHERE id = ?";
			pr= cn.prepareStatement(sql);
			pr.setInt(1,proveedorId);
		
			int filas = pr.executeUpdate();
			if(filas==1){
				flag=true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
            pr.close();
            cn.close();
	}
		return flag;
	}
	
	
	public Proveedor obtener(int proveedorId) throws SQLException{
		Proveedor proveedor = new Proveedor();
		try {
			cn = Conexion.abrirConexion();
			String sql = "SELECT * FROM PROVEEDOR WHERE id=?";
			pr = cn.prepareStatement(sql);
			pr.setInt(1,proveedorId);
			rs = pr.executeQuery();
			    if(rs.next()) {
				proveedor = new Proveedor();
				proveedor.setId(rs.getInt("id"));
				proveedor.setNombre(rs.getString("nombre"));
				proveedor.setEstado(rs.getString("estado"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
            pr.close();
            cn.close();
            rs.close();
	}
		return proveedor;
	}
		
}
