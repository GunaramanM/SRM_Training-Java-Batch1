import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PrtStmDel
{
    
     public static void main(String args[])
     {
          try
          {
               Class.forName("com.mysql.cj.jdbc.Driver");
               
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/guna","root","password");
             
               String sql = "INSERT INTO  students(rollno,name,class,age values(?,?,?,?)";
              
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setInt(1, 7);
               statement.setString(2, "guna");
               statement.setString(3, "10");
               statement.setString(4, "16");
               

               int rowsInserted = statement.executeUpdate();
               if (rowsInserted > 0)
               {
                    System.out.println("A new record was inserted successfully!\n");
               }


               String sql1 = "SELECT * FROM users";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql1);

               while (result.next())
               {
                    System.out.println (result.getInt(1)+" "+
                    result.getString(2)+" "+
                    result.getString(3)+" "+
                    result.getString(4));
               }


               String sql2 = "Update users set username = ? where username = ?";
               PreparedStatement pstmt = con.prepareStatement(sql2);
               pstmt.setString(1, "aki");
               pstmt.setString(2, "agal");
               int rowUpdate = pstmt.executeUpdate();
               if (rowUpdate > 0)
               {
                    System.out.println("\nRecord updated successfully!!\n");
               }


               String sql3 = "DELETE FROM users WHERE username=?";
               PreparedStatement statement1 = con.prepareStatement(sql3);
               statement1.setString(1, "ajay");

               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    System.out.println("A record was deleted successfully!\n");
               }
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}