/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalearning;

import java.io.FileInputStream;
import java.sql.*;

//CREATE TABLE TeamImage (
//    id INT AUTO_INCREMENT PRIMARY KEY,
//    name VARCHAR(255) NOT NULL,
//    image LONGBLOB NOT NULL
//);

/**
 *
 * @author RCAT
 */
class StoreImgInDb {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
            PreparedStatement ps = con.prepareStatement("INSERT INTO TeamImage (name, image) VALUES (?, ?)");
            FileInputStream fis = new FileInputStream("img1.jpg");
            
            ps.setString(1, "Bhaw");
            ps.setBinaryStream(2, fis, fis.available());
            
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
