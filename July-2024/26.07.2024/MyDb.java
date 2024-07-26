
import java.sql.*;

class MyDb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhawuk", "root", "bhawuk42");
            Statement st = con.createStatement();
            // ResultSet rs = st.executeQuery("select * from student");
            // st.executeUpdate("insert into student values (107, 'Bhawuk', 'Python')");
            // st.executeUpdate("delete from student where id=102");
            st.executeUpdate("update student set name="Bhau" where id=104");

            // while (rs.next()) {
            //     System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            // }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
