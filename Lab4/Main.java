//package Lab4;
//
//import java.sql.*;
//
//public class Main {
//    private static Connection conn = null;
//
//    public static void main(String[] args) {
//        connect();
//        runQuery();
//        closeConnection();
//    }
//
//    public static void connect(); {
//        String dbFile = "jdbc:sqlite:data.sqlite";
//        try {
//            conn = DriverManager.getConnection(dbFile);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        }
//    }
//
//    public static void runQuery() {
//        try {
//            Statement statement = conn.createStatement();
//            String sqlQuery = "SELECT COUNT(*) FROM class";
//            ResultSet resultSet = statement.executeQuery(sqlQuery);
//            int count = resultSet.getInt(1);
//            System.out.println(String.format("There were %d records.", count));
//            sqlQuery = "SELECT id, name, courseNumber, department, credits FROM class";
//            statement = conn.createStatement();
//            resultSet = statement.executeQuery(sqlQuery);
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                String course = resultSet.getString("courseNumber");
//                int id = resultSet.getInt("id");
//                int credits = resultSet.getInt("credits");
//                String dept = resultSet.getString("department");
//                Course c = new Course(course, name, dept, credits);
//                System.out.println(c);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void closeConnection() {
//        try {
//            conn.close();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.exit(1);
//        }
//    }
//}