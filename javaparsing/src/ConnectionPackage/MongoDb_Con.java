package ConnectionPackage;
import com.mongodb.MongoClient;

public class MongoDb_Con {

    public MongoClient  MongoConnect_Fun(){
        MongoClient mongoClient = new MongoClient("localhost",27017);
        return mongoClient;
    }


}
