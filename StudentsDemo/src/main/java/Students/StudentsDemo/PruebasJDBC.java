package Students.StudentsDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jdbcUrl="jdbc:mysql://localhost:3306/school?useSSL=false";
		String username = "root";
		String password = "123456789";
		
		try {
			System.out.println("Intentando establecer coneccion "+ jdbcUrl);
			Connection myConeccion = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Coneccion exitosaaaaa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Coneccionnnnnn fallida");
			e.printStackTrace();
		}
		
	}

}
