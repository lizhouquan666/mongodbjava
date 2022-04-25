import com.lpd.mongodb.App;
import com.lpd.mongodb.pojo.Msg;
import com.lpd.mongodb.service.InsertServiceImpl;
import com.lpd.mongodb.service.QueryServiceImpl;
import com.lpd.mongodb.service.UpdateServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = App.class)
public class mongotets {

    @Autowired
private InsertServiceImpl insertMsg;
    @Autowired
    private QueryServiceImpl queryService;

    @Autowired
    private UpdateServiceImpl updateService;


    @Test
    public  void insert() {



 //   Object collection = createCollectionService.createCollection();
  // Msg msg = new Msg();
      //  msg.setData("999");
       // insertMsg.insertMsg(msg);
    // Object byCondition = queryService.findByCondition("3");
      //  System.out.println(byCondition);
      updateService.updateMany("3","2");

    }
}
