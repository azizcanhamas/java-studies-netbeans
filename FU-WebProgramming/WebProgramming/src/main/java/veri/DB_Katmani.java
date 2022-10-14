package veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Katmani {

    public Connection baglan() throws SQLException{
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/fudb?user=root&password=602343az");
        return conn;
    }
    
}
