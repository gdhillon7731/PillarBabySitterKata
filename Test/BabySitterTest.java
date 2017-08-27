import com.company.BabySitter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BabySitterTest {



    @Test
    public void startTime_5pm_EndTime_4pm_BedTime_8pm_PayTotal_132(){
        BabySitter babySitter = new BabySitter();
        int totalPay = babySitter.calculatePay(17, 4, 20);
        assertEquals(totalPay, 132);
    }

    @Test
    public void startTime_5pm_EndTime_3pm_BedTime_8pm_PayTotal_116(){
        BabySitter babySitter = new BabySitter();
        int totalPay = babySitter.calculatePay(17, 3, 20);
        assertEquals(totalPay, 116);
    }
    @Test
    public void startTime_5pm_EndTime_12am_BedTime_9pm_PayTotal_92(){
        BabySitter babySitter = new BabySitter();
        int totalPay = babySitter.calculatePay(17, 24, 21);
        assertEquals(totalPay, 72);
    }

}
