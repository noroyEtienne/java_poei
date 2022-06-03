package cours.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDCB2 {

	public static void main(String[] args) throws Exception {
		Connection connect = TestJDBC1.connect();
		
		Statement st = connect.createStatement();
		
		int prixMax = 50;
		ResultSet rs = st.executeQuery("select * from books where price < " + prixMax);
		
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

}
