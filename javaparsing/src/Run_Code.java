import ConnectionPackage.MySQL_Con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class Run_Code {
    MySQL_Con My_connection = new MySQL_Con();
    MongoDB_Script mongoDBScript = new MongoDB_Script();


    protected void Mysql_code()throws Exception{

        try{
            My_connection.Connect_Fun();
            Statement stmnt = My_connection.getConnection();
            String sql ="select* from  faculty";
            ResultSet resultset = stmnt.executeQuery(sql);
            while (resultset.next()){
                String name = resultset.getString(1);
                String surname = resultset.getString(2);
                String password = resultset.getString(3);
                mongoDBScript.Mongo_Func(name,surname,password);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
