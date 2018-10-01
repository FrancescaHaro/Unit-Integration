package lets.develop.BpzCore.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import lets.develop.BpzCore.entity.Factura;
import lets.develop.BpzCore.util.Conexion;


public class FacturaDao {

	private PreparedStatement pr;
	private Connection cn;
	private ResultSet rs;
	
	public boolean insertar(Factura e) throws Exception {
		 boolean flag = false;
		 try {
	            cn = Conexion.abrirConexion();
	            String sql = "INSERT INTO FACTURA (codigo,fechaFacturacion,fechaVencimiento,proveedorId,moneda,precio,estado) VALUES (?,?,?,?,?,?,?)";
	            pr = cn.prepareStatement(sql);
	            pr.setLong(1, e.getCodigo());
	            pr.setDate(2, (Date) e.getFechaFacturacion());
	            pr.setDate(3, (Date) e.getFechaVencimiento());
	            if(e.getProveedor()!= null){
	            	pr.setInt(4, e.getProveedor().getId());
	            }else{
	            	pr.setInt(4, e.getProveedorId());
	            }
	            pr.setString(5, e.getMoneda());
	            pr.setDouble(6, e.getPrecio());
	            pr.setString(7, e.getEstado());
	            
	            int fila = pr.executeUpdate();
	            if(fila == 1) {
	            	flag = true;
	            }
	        } catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	            pr.close();
	            cn.close();
			}
	        return flag;
	}


	public boolean actualizar(Factura e) throws Exception {
		 boolean flag = false;
		 try{
			 	cn = Conexion.abrirConexion();
	            String sql = "UPDATE FACTURA SET codigo=?,fechaFacturacion=?,fechaVencimiento=?, proveedorId=?, moneda=?, precio =?, estado = ? WHERE id=?";
	            pr = cn.prepareStatement(sql);
	            pr.setLong(1, e.getCodigo());
	            pr.setDate(2, (Date) e.getFechaFacturacion());
	            pr.setDate(3, (Date) e.getFechaVencimiento());
	            if(e.getProveedor()!= null){
	            	pr.setInt(4, e.getProveedor().getId());
	            }else{
	            	pr.setInt(4, e.getProveedorId());
	            }
	            pr.setString(5, e.getMoneda());
	            pr.setDouble(6,e.getPrecio());
	            pr.setString(7, e.getEstado());
	            pr.setInt(8, e.getProveedorId());
	            pr.executeUpdate();
	            
	            int fila = pr.executeUpdate();
	            if(fila == 1) {
	            	flag = true;
	            }
	            
	        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	        	rs.close();
	            pr.close();
	            cn.close();
			}
	        return flag;
	}


	public boolean eliminar(int facturaId) throws Exception {

		 boolean flag = false;
		 try{
			 	cn = Conexion.abrirConexion();
	            String sql = "UPDATE FACTURA set estado = 'INA' WHERE id=? ";
	            pr = cn.prepareStatement(sql);
	            pr.setInt(1,facturaId);
	            pr.executeUpdate();
	            
	            int filas = pr.executeUpdate();
				if(filas==1){
					flag=true;
				}
	            
	        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	        	rs.close();
	            pr.close();
	            cn.close();
			}
	        return flag;
	}

	public Factura obtener(int facturaId) throws Exception {
		   Factura factura = null;
	        try{
	        	
	        	
	        	cn = Conexion.abrirConexion();
	            String sql = "select *from factura WHERE id=?";
	            pr = cn.prepareStatement(sql);
	            pr.setInt(1, facturaId);
	            rs = pr.executeQuery();
	            while(rs.next()){
	                factura = new Factura();
	                factura.setId(rs.getInt("id"));
	                factura.setCodigo(rs.getLong("codigo"));
	                factura.setFechaFacturacion(rs.getDate("fechaFacturacion"));
	                factura.setFechaVencimiento(rs.getDate("fechaVencimiento"));
	                factura.setMoneda(rs.getString("moneda"));
	                factura.setPrecio(rs.getDouble("precio"));
	                factura.setProveedorId(rs.getInt("proveedorId"));

	            }
	        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	        	rs.close();
	            pr.close();
	            cn.close();
			}
	        return factura;
	}

	
	public List<Factura> listar() throws Exception {
		List<Factura> facturas = new ArrayList<Factura>();
        Factura factura = null;
        try{
        	cn = Conexion.abrirConexion();
            String sql = "SELECT * FROM FACTURA";
            pr = cn.prepareStatement(sql);
            rs = pr.executeQuery();
            while(rs.next()){
           	 factura = new Factura();
           	 factura.setId(rs.getInt("id"));
           	 factura.setCodigo(rs.getLong("codigo"));
           	 factura.setFechaFacturacion(rs.getDate("fechaFacturacion"));
	             factura.setFechaVencimiento(rs.getDate("fechaVencimiento"));
	             factura.setMoneda(rs.getString("moneda"));
	             factura.setPrecio(rs.getDouble("precio"));
	             factura.setEstado(rs.getString("estado"));
	             factura.setProveedorId(rs.getInt("proveedorId"));
           	 facturas.add(factura);
            }
        }catch(Exception ex) {
	            System.out.println(ex.getMessage());
	        }finally {
	        	rs.close();
	            pr.close();
	            cn.close();
			}
        return facturas;
	}
	
	public List<Factura> listar(Long codigo) throws Exception{
		List<Factura> facturas = new ArrayList<Factura>();
		Factura factura = null;
		try{
	       	    cn = Conexion.abrirConexion();
	            String sql = "SELECT * FROM FACTURA where codigo =? ORDER BY codigo";
	            pr = cn.prepareStatement(sql);
	            pr.setLong(1, codigo);
	            rs = pr.executeQuery();
	            while(rs.next()){
	           	 factura = new Factura();
	           	 factura.setId(rs.getInt("id"));
	           	 factura.setCodigo(rs.getLong("codigo"));
	           	 factura.setFechaFacturacion(rs.getDate("fechaFacturacion"));
		             factura.setFechaVencimiento(rs.getDate("fechaVencimiento"));
		             factura.setMoneda(rs.getString("moneda"));
		             factura.setPrecio(rs.getDouble("precio"));
		             factura.setEstado(rs.getString("estado"));
		             factura.setProveedorId(rs.getInt("proveedorId"));
	           	 facturas.add(factura);
	            }
	        }catch(Exception ex) {
		            System.out.println(ex.getMessage());
		        }finally {
		        	rs.close();
		            pr.close();
		            cn.close();
				}
	        return facturas;
	}

	
}
