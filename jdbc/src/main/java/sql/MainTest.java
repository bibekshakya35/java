package sql;

import java.sql.SQLException;

/**
 * Created by bibek on 7/24/17.
 */
public class MainTest {
    public static void main(String[] args) throws SQLException{
        MySQLAccess mySQLAccess = new MySQLAccess();
        mySQLAccess.readDataBase();
    }
}
