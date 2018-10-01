package lets.develop.BpzCore.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	public static Connection abrirConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/bpzdb?useSSL=false";
			Connection conexion=DriverManager.getConnection(url,"root","");
			return conexion;	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return null;
		}
	}
}
