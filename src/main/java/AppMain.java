public class AppMain {

    public static void main(String[] args) {

            int number = 3;


        System.out.println(calculateFac(number));

    }

    public static int calculateFac(int value){

        int fac = 1;
        if (value == 0) {
            return fac;
        }

        for(int i = 1; i <= value; i++){
            fac = fac * i;
        }
        return fac;

    }
}