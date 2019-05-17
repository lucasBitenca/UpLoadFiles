
public class DBConnect {
	public void Connect() {
System.out.println("DBConnect...");
		
		//String de conexão com banco de dados MySQL
		
		              //jdbc:mysql://localhost:3306/dbname
		String dburl = "jdbc:mysql://localhost:3306/FTT";
		
		String user="scott";
		String pwd="tiger";
		
		try {
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			//Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(dburl, user, pwd);
		
			String query = "SELECT COUNT(1) QTD FROM FTT.PEOPLE;";
			
			Statement st = connection.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			
			System.out.println("QTD: " + rs.getString("QTD"));
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //try
	}
}
