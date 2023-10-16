/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohit
 */
public class DbConnection
{
    static Connection con;
    static public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software_j2se","root","mohit123");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
