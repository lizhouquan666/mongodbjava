/*
import com.lpd.mongodb.App;
import com.lpd.mongodb.service.CreateCollectionService;
import com.lpd.mongodb.service.InsertService;
import com.lpd.mongodb.service.QueryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest(classes = App.class)
public class mongotets {

    @Autowired
private InsertService insertMsg;
    @Autowired
    private QueryService queryService;


    @Test
    public  void insert() {

   // insertMsg.insertMsg();

 //   Object collection = createCollectionService.createCollection();

      insertMsg.insertMsg();

        Object byCondition = queryService.findByCondition("55");
        System.out.println(byCondition);

    }
}
*/
