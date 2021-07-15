import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost:3306/guna";
   static final String USER = "root";
   static final String PASS = "root";
   static final String QUERY = "SELECT AGENT_CODE, AGENT_NAME, WORKING_AREA FROM agents";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            System.out.print("Code: " + rs.getInt("AGENT_CODE"));
            System.out.print(", Name: " + rs.getInt("AGENT_NAME"));
            System.out.print(", Area: " + rs.getString("WORKING_AREA"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}