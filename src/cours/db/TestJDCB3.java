package cours.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDCB3 {

	public static void main(String[] args) throws Exception {
		Connection connect = TestJDBC1.connect();
		
		PreparedStatement st = connect.prepareStatement("select * from books where price < ?;");
		
		int prixMax = 50;
		
		st.setInt(1, prixMax);
		
		ResultSet rs = st.executeQuery();
		
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
