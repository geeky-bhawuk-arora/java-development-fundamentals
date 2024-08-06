/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalearning;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

/**
 *
 * @author RCAT
 */
class RetrieveImg {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
//            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoDb", "postgres", "bhawuk42");

            PreparedStatement ps = con.prepareStatement("select * from TeamImage");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Blob b = rs.getBlob(2);
                byte barr[] = b.getBytes(1, (int) b.length());

                FileOutputStream fout = new FileOutputStream("bhawuk.jpg");
                fout.write(barr);
                fout.close();
            }
            System.out.println("Ok");
            con.close();
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
