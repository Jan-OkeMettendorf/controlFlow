import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppMainTest {

   @Test
   void testFillArray(){

      //GIVEN

         String[] expected = {"Student 1","Student 2", "Student 3"};

      //WHEN

         String[] actual = AppMain.fillArray(expected.length);

      //THEN

         Assertions.assertArrayEquals(expected, actual);

   }

}



