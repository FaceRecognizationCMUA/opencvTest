/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
public class testconn {
    public static Connection conn;
    public static Statement st;
    public static String sql;
    public static ResultSet rs;
    public static ResultSetMetaData rsmd;
    public static String url;
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e1){
            System.out.println("MySQL Driver not found!!");
        }
        url="jdbc:mysql://opencvdb.cxsp5jskrofy.us-west-2.rds.amazonaws.com:3306";    //URL of JDBC
        try{
                conn = DriverManager.getConnection(url,"admin","cmua2014");
                st = conn.createStatement(); //create a Statement object
                System.out.println("Connected!");
                sql="create table test (id int(1), name char(10))";
                     st.execute(sql);
//                st.executeQuery(sql);
            }
        catch(SQLException se){
            System.out.println(se);
            }
        }
    
}
