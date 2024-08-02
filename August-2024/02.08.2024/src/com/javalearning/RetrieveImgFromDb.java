/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalearning;

import java.io.FileOutputStream;
import java.sql.*;

/**
 *
 * @author RCAT
 */
class RetrieveImgFromDb {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
