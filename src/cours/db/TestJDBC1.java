package cours.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC1 {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = connect();
		
		Statement st = connect.createStatement();
		ResultSet rs = st.executeQuery("select * from books");
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String title = rs.getString("title");
			double price = rs.getDouble("price");
			
			System.out.println("Id : " + id + " Title : " + title + " Price : " + price);
		}
		System.out.println("OK");
		rs.close();
		st.close();
		connect.close();
	}

	public static Connection connect() {
		
		try
        {
		String myDriver = "com.mysql.cj.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:3307/jdbc";
        Class.forName(myDriver);
        
        return DriverManager.getConnection(myUrl, "stage", "formation");
        
        }
		catch(Exception ex) {
			 System.err.println("Impossible de se connecter à la base de donnée !");
	         System.err.println(ex.getMessage());
		}
		
		return null;
	}
}
