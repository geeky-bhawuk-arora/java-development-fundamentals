/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalearning;

/**
 *
 * @author RCAT
 */
import java.sql.*;

class _01MyDb {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
//            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DemoDb", "postgres", "bhawuk42");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
//             st.executeUpdate("insert into student values (107, 'Bhawuk', 'Python')");
//             st.executeUpdate("delete from student where id=102");
//            st.executeUpdate("update student set name="Bhau" where id=104");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
