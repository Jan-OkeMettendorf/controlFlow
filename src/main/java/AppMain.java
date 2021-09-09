import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {

        int numberOfStudents = 3;

        System.out.println(Arrays.toString(fillArray(numberOfStudents)));

    }

    public static String[] fillArray(int numberOfStudents){

        String[] someArray = new String[numberOfStudents];

        for (int i = 0; i < someArray.length; i++){

            int count = i + 1;

            someArray[i] = "Student " + count;

        }
        return someArray;

    }

}
