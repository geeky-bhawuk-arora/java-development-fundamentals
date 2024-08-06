/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalearning;

import java.sql.*;

/**
 *
 * @author Deepika
 */
public class PreparedStmt {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
//            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoDb", "postgres", "bhawuk42");
            PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?)");
            stmt.setInt(1, 6);//1 specifies the first parameter in the query
            stmt.setString(2, "Rohan");
            stmt.setString(3, "SQL");
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
