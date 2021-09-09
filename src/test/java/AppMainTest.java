import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppMainTest {

    @Test
    void checkAlarmSignalAndCapacityRedCapacityAllowed(){

        //GIVEN

            int a = 0;
            String Alarm = "red";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number not reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityRedCapacityNotAllowed(){

        //GIVEN

            int a = 1;
            String Alarm = "red";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityYellowCapacityAllowed(){

        //GIVEN

            int a = 30;
            String Alarm = "yellow";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number not reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityYellowCapacityNotAllowed(){

        //GIVEN

            int a = 31;
            String Alarm = "yellow";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityGreenCapacityAllowed(){

        //GIVEN

            int a = 60;
            String Alarm = "yellow";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number not reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityGreenCapacityNotAllowed(){

        //GIVEN

            int a = 61;
            String Alarm = "yellow";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("maximum number reached.", actual);

    }

    @Test
    void checkAlarmSignalAndCapacityUnknownAlarm(){

        //GIVEN

            int a = 61;
            String Alarm = "";

        //WHEN

            String actual = AppMain.checkAlarmSignalAndCapacity(a, Alarm);

        //THEN

            Assertions.assertEquals("unknown Alarm.", actual);

    }


    /*@Test
    void testCheckCountGreaterThan30True(){

        //GIVE

            int a = 34;

        //WHEN

            String result = AppMain.checkCountGreaterThan30(a);

        //THEN

        Assertions.assertEquals("maximum number reached", result);

    }

    @Test
    void testCheckCountGreaterThan30False(){

        //GIVE

            int a = 15;

        //WHEN

            String result = AppMain.checkCountGreaterThan30(a);

        //THEN

            Assertions.assertEquals("maximum number not reached", result);

    }

    @Test
    void testCheckCountIs30(){

        //GIVE

            int a = 30;

        //WHEN

            String result = AppMain.checkCountGreaterThan30(a);

        //THEN

            Assertions.assertEquals("maximum number reached", result);

    }*/


}
