import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/mytest";
    private static String USER = "root";
    private static String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            Class.forName(DRIVER);
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tbl_users VALUES(6,'Jane','Doe', 22)");
            // executeUpdate used for insert, update or delete statements.

            ResultSet rs = statement.executeQuery("Select * from tbl_users");
            // executeQuery used to return data.

            while (rs.next()) {
                int uid = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                int age = rs.getInt(4);

                System.out.println(uid + " " + fname + " " + lname + " " + age);

            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver class not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error while executing query");
            e.printStackTrace();
        }

    }
}