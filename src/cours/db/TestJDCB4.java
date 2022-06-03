package cours.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDCB4 {

	public static void main(String[] args) throws Exception {
		Connection connect = TestJDBC1.connect();
		
		PreparedStatement st = connect.prepareStatement("insert into books(id, title, author, price, qty) values(?,?,?,?,?)");
		
		int id = 1006;
		String title = "Le Petit Prince";
		String author = "St-Exupéry";
		double price = 5.00;
		int qty = 25;
		
		st.setInt(1, id);
		st.setString(2, title);
		st.setString(3, author);
		st.setDouble(4, price);
		st.setInt(5, qty);
		
		int idEntry = st.executeUpdate();
		System.out.println(idEntry);
		
		System.out.println("OK");
		st.close();
		connect.close();

	}

}
