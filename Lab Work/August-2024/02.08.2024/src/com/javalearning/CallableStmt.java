package com.javalearning;

import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Deepika
 */
public class CallableStmt {

    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoDb", "postgres", "bhawuk42");
            CallableStatement stmt = con.prepareCall("{call showemp()}");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
