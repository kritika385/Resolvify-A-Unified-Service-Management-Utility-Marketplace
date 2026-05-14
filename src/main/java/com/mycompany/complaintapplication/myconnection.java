/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complaintapplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hp
 */
public class myconnection {
    // Ye line 'public class' ke JUST NICHE likho
public static java.sql.Connection getconnectivity() {
    Connection con = null;
        try {
            // Driver load ho raha hai
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Database se hath mila rahe hain
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resolvify", "root", "K#10rjnp@bti");
        } catch (Exception e) {
            // Agar error aaye toh yahan dikhega
            System.out.println("Connection Error: " + e.getMessage());
        }
        return con;
}
public static void main(String[] args) {
       System.out.println("Testing Database Connection...");
        Connection test = getconnectivity();
        
        if (test != null) {
            System.out.println("-----------------------------------------");
            System.out.println("Success: Database connected successfully!");
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Error: Connection failed. Please check MySQL.");
            System.out.println("-----------------------------------------");
        }
    }
}
