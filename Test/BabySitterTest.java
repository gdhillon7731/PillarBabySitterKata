import com.company.BabySitter;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    private BabySitter babySitter;
    int totalPay;

    @Before
    public void setUp(){
        babySitter = new BabySitter();
    }

    @Test
    public void startTime_5pm_EndTime_4am_BedTime_8pm_PayTotal_132(){

        totalPay = babySitter.calculatePay(17, 4, 20);
        assertEquals(132, totalPay);
    }

    @Test
    public void startTime_5pm_EndTime_3am_BedTime_8pm_PayTotal_116(){

        totalPay = babySitter.calculatePay(17, 3, 20);
        assertEquals(116,totalPay);
    }
    @Test
    public void startTime_5pm_EndTime_12am_BedTime_9pm_PayTotal_72(){

        totalPay = babySitter.calculatePay(17, 24, 21);
        assertEquals(72, totalPay);
    }

    @Test
    public void startTime_5pm_EndTime_4am_BedTime_12am_148(){

        totalPay = babySitter.calculatePay(17, 4, 24);
        assertEquals(148 , totalPay);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void start_Time_Before_5pm(){
        totalPay = babySitter.calculatePay(16, 4, 20);

    }


    @Test (expected = IndexOutOfBoundsException.class)
    public void End_Later_Than_4am(){
        totalPay = babySitter.calculatePay(17, 5, 20);

    }

}
