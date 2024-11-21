package Lesson10;

<<<<<<< HEAD
=======
import Project2.Course;

>>>>>>> f4bff272b664f09ddde240d52dc2ddd34f76527d
import java.sql.*;

// Step 1 - create connection
// Step 2 - write or build a query
// Step 3 - run/execute the query
// Step 4 - if returns data, capture data
// Step 5 - iterate over data
<<<<<<< HEAD
// Step 6 - close connection

public class Main {

    private static Connection conn = null;

    public static void main(String[] args) {
        conn();
=======

public class Main {
    private static Connection conn = null;

    public static void main(String[] args) {
        connect();
>>>>>>> f4bff272b664f09ddde240d52dc2ddd34f76527d
        runQuery();
        closeConnection();
    }

<<<<<<< HEAD
    public static null

    conn();

    {
        try {
            conn =
        } catch ()
    }

    public static runQuery() {

    }
    public static void closeConnection() {
        try {
            conn.close();
        }
        catch(Exception e) {
            System.exit(1);
        }
    }
}
=======
    public static void connect() {
        String dbFile = "jdbc:sqlite:data.sqlite";
        try {
            conn = DriverManager.getConnection(dbFile);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void runQuery() {
        try {
            Statement statement = conn.createStatement();
            String sqlQuery = "SELECT COUNT(*) FROM class";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            int count = resultSet.getInt(1);
            System.out.println(String.format("There were %d records.", count));
            sqlQuery = "SELECT id, name, courseNumber, department, credits FROM class";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String course = resultSet.getString("courseNumber");
                int id = resultSet.getInt("id");
                int credits = resultSet.getInt("credits");
                String dept = resultSet.getString("department");
                Course c = new Course(course, name, dept, credits);
                System.out.println(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
>>>>>>> f4bff272b664f09ddde240d52dc2ddd34f76527d
