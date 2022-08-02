package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnect {
    private String username="root";
    private String password="";    

    protected String query="";
    protected Statement state=null;
    protected PreparedStatement prepare=null;
    protected ResultSet set=null;
    protected Connection conn;
    
    public dbConnect(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");          
        }catch(SQLException e){
            return;
        }
    }
}

