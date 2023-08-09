package day11.solved;

import java.util.List;

import day11.practice.DAOException;
import day11.practice.TaskDAO;
import day12.practice.Day12Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	public static void main(String[] args) {
		getConnection();
	}
	 
    public static Connection getConnection()  {
 
        Connection con = null;
        String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java"; // url for to connect local database
        String userName = "dirzv8xkwiwm3q2p8ltl";
        String passWord = "pscale_pw_CYLCNKglwGOQoZcb7gqsleuePdJcBeQAy2VfFm9j2Ja";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, passWord);
            System.out.println("connection created");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to connect to the database");
        }
        return con;
    
	}
     
    public static void close(Connection conn , Statement stmt, ResultSet rs){
         
        try
        {
            if ( rs != null ){
                rs.close();
            }
            if ( stmt != null ) {
                stmt.close();
            }
            if ( conn != null ){
                conn.close();
            }
        }
        catch(SQLException e){
             e.printStackTrace();
						 // No need re throw the exception.
        }
    
    
	}
}