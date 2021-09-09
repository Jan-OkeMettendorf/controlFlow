public class AppMain {

    public static void main(String[] args) {

            int number = 5;


        System.out.println(calculateFac(number));

    }

    public static int calculateFac(int value){

        int fac = 1;
        int i = 1;

        if (value == 0) {
            return fac;
        }


        while( i <= value){
            fac *= i;
            i++;
        }

        return fac;

    }
}