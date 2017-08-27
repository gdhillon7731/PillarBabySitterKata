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

}