package com.itsolutioncompany.ganador.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
	
	public static final String Driver="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/jugada?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String usuario="root";
	public static final String clave="P@ssw0rd86";
	
	
	public  Connection getConeccionBD(){
		
		Connection cn=null;
		
		
		try {
			
			Class.forName(Driver);
			cn=DriverManager.getConnection(URL,usuario,clave);
			System.out.println("Conexion Exitosa");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error de Conexion" + e.getMessage());
		}
		
		return cn;
		
	}

}
