import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppMainTest {

   @ParameterizedTest
   @CsvSource({

           "0, 1",
           "1, 1",
           "2, 2",
           "3, 6",
           "4, 24",
           "5, 120",

           })
    public void testCalculateFac(int given, int expected){

       //WHEN

       int actual = AppMain.calculateFac(given);

       //THEN

       Assertions.assertEquals(expected, actual);

   }


}
