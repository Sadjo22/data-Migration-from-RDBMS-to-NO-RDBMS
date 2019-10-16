import ConnectionPackage.MongoDb_Con;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;





public class MongoDB_Script {

     MongoDb_Con mongoDbCon = new MongoDb_Con();
     MongoClient mongoClient = mongoDbCon.MongoConnect_Fun();


    protected void Mongo_Func(String nam, String user, String pswd){
        MongoDatabase mongoDatabase = mongoClient.getDatabase("RegistrationForm");
        MongoCollection mongoCollection = mongoDatabase.getCollection("Facolta");
        Document document = new Document();
        document.append("Name",nam);
        document.append("Surname",user);
        document.append("Password",pswd);
        mongoCollection.insertOne(document);
    }
}
