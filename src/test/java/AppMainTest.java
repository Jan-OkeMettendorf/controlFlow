import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppMainTest {

    @Test
    void testCheckCountGreaterThan30True(){

        //GIVE

            int a = 34;

        //WHEN

            boolean result = AppMain.checkCountGreaterThan30(a);

        //THEN

            Assertions.assertTrue(result);

    }

    @Test
    void testCheckCountGreaterThan30False(){

        //GIVE

            int a = 15;

        //WHEN

            boolean result = AppMain.checkCountGreaterThan30(a);

        //THEN

            Assertions.assertFalse(result);

    }

    @Test
    void testCheckCountIs30True(){

        //GIVE

        int a = 29;

        //WHEN

        boolean result = AppMain.checkCountGreaterThan30(a);

        //THEN

        Assertions.assertTrue(result);

    }


}
