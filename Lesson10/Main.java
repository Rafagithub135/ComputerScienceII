package Lesson10;

import java.sql.*;

// Step 1 - create connection
// Step 2 - write or build a query
// Step 3 - run/execute the query
// Step 4 - if returns data, capture data
// Step 5 - iterate over data
// Step 6 - close connection

public class Main {

    private static Connection conn = null;

    public static void main(String[] args) {
        conn();
        runQuery();
        closeConnection();
    }

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
