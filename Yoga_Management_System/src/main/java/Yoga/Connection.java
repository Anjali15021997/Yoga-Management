package Yoga;
import java.sql.*;
public class Connection 
{
    Connection con;
    Statement stm;
    Connection()//constructor name same as class name
    {
        try
        {
            Class.forName("con.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yoga_management","system","1234");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String s[])
    {
        new Connection();
    }
}
    