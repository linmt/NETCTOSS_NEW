import com.lmt.dao.RelationDao;
import com.lmt.dao.VehicleDao;
import com.lmt.entity.NoteBook;
import com.lmt.entity.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 热带雨林 on 2018/12/23.
 */
public class TestVehicle extends BaseJunit4Test {
    private VehicleDao vdao;

    @org.junit.Before
    public void init(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        vdao=ac.getBean("vehicleDao",VehicleDao.class);
    }

    @org.junit.Test
    public void test4( ){
        List<Vehicle> vehicles=vdao.findAll();
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
    }
}
