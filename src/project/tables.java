
package project;

import javax.swing.JOptionPane;
import java.sql.*;


public class tables 
{
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            //st.executeUpdate("create table users (name varchar(200),email varchar(200),password varchar(50),securityQestion varchar(500),answer varchar(200),address varchar(500),status varchar(20))");
            //st.executeUpdate("create table room (roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customer1(id int,name varchar(200),mobileNumber varchar(10),nationality varchar(200),gender varchar(50),email varchar(50),idProof varchar(50),address varchar(200),checkIn varchar(50),roomNo varchar(50),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberofDaysStay int(10),totalAmmount varchar(200),checkout varchar(50))");
              //st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(10),nationality varchar(200),gender varchar(50),email varchar(50),idProof varchar(50),address varchar(200),roomNo varchar(50),bed varchar(200),roomType varchar(200),pricePerDay int(10))");
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
