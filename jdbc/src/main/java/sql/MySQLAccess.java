package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by bibek on 7/24/17.
 */
public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws SQLException {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/testDb", "root", "password");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            PreparedStatement preparedStatement = connect.prepareStatement("insert into testDb.users(id,name) values(?,?)");
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Rajesh SHrestha");
            preparedStatement.executeUpdate();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT * from users");
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println("Id : " + id + "Name" + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {


        }

    }
}
