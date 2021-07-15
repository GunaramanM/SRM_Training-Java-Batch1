import java.sql.*;  
public class Transaction{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/guna","root","password");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into student values(2,'guna','hello','gunaraman','guna@gmail.com')");
stmt.executeUpdate("insert into student values(3,'hi,'hi','hihello','rahul@gmail.com')");
    
con.commit();  
con.close();  
}
}