import com.lpd.mongodb.App;
import com.lpd.mongodb.pojo.Msg;
import com.lpd.mongodb.service.CreateCollectionService;
import com.lpd.mongodb.service.InsertService;
import com.lpd.mongodb.service.QueryService;
import com.lpd.mongodb.service.UpdateService;
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

    @Autowired
    private UpdateService updateService;


    @Test
    public  void insert() {

//insertMsg.insertMsg();

 //   Object collection = createCollectionService.createCollection();
   /*     Msg msg = new Msg();
        msg.setData("666");
        insertMsg.insertMsg(msg);*/
     // Object byCondition = queryService.findByCondition("3");
       // System.out.println(byCondition);
        Object o = updateService.updateMany();
        System.out.println(o);
    }
}
