package HackLabs.Module6.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstrates updating existing records in a table
 */
public class UpdateInventoryRecords {

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

            stmt.executeUpdate("UPDATE inventory SET price=13.50 WHERE name='Hammer'");                                         //Execute the SQL statement to update a record
            stmt.executeUpdate("UPDATE inventory SET price=12.99, quantity=100 WHERE name='Wrench'");                           //Execute the SQL statement to update a record
            System.out.println("Two rows successfully updated.");

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