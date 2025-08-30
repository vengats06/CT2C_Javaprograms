package jdbc;
import java.sql.*;
public class Jdbc_Demo {
	public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres"; // DB name
        String user = "postgres";    // your username
        String password = "12345678"; // your password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connect to Database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database!");

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query
            String query = "SELECT empid, ename, ecity FROM emp";
            rs = stmt.executeQuery(query);

            // Process ResultSet
            System.out.println("Employee Details:");
            while (rs.next()) {
                int id = rs.getInt("empid");         // get int column
                String name = rs.getString("ename"); // get string column
                String city = rs.getString("ecity"); // get string column

                System.out.println("ID: " + id + " | Name: " + name + " | City: " + city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
