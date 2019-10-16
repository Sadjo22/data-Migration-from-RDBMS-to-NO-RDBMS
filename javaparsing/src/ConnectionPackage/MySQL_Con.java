package ConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MySQL_Con {
    private final   String host ="jdbc:mysql://localhost:3306/prova?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final   String Username = "root";
    private final String Pswd  ="karine91";
    public Statement getStmnt = null;

    public void Connect_Fun()throws Exception{

            //connection with mysql
            Connection con = DriverManager.getConnection(host,Username,Pswd);
            Statement stmnt = con.createStatement();
            getStmnt = stmnt;
    }

    public Statement getConnection(){
        return getStmnt;
    }
}
