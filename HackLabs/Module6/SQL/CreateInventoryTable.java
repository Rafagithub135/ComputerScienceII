package HackLabs.Module6.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstrates creating a table
 */
public class CreateInventoryTable {

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

            stmt.execute("CREATE TABLE inventory (name varchar(15), model varchar(5), quantity int, price double precision)");  //Execute the SQL statement to create a table
            System.out.println("Inventory table successfully created.");

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