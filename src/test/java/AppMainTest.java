import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AppMainTest {

   @Test
    void testCalculateFac(){

       //GIVEN

       int a = 2;

       //WHEN

       int actual = AppMain.calculateFac(a);

       //THEN

       Assertions.assertEquals(0, actual);

   }


}
