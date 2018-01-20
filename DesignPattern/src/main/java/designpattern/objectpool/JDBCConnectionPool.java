package designpattern.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {
    private String dsn, usr, pwd;

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException sql) {
            sql.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean validate(Connection o) {
        try{
            return (!((Connection)o).isClosed());
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }
}
