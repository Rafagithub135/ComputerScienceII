package HackLabs.Module6.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstrates inserting records to a table
 */
public class InsertInventoryRecords {

    /**
     * Main method.
     * This is where the program begins.
     */
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Module6.db");                      //Create connection to database server
            System.out.println("Connected to 'Module6' database.");

            stmt = conn.createStatement();                                                                                      //Create a Statement object

            stmt.executeUpdate("INSERT INTO inventory VALUES ('Hammer', '11A12', 34, 12.54)");                                  //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory VALUES ('Screwdriver', '10002', 15, 8.00)");                              //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory VALUES ('Saw', 'SW950', 22, 16.99)");                                     //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory VALUES ('Wrench', '64BC3', 28, 10.95)");                                  //Execute the SQL statement to insert a record
            System.out.println("Four rows successfully inserted.");

        }
        catch(SQLException e) {
            System.out.println("Error with database: " + e.getMessage());
        }
        finally {
            try {
                stmt.close();                                                                                                   //Try to close statement
                conn.close();                                                                                                   //Try to close connection
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
            }
        }
    }
}