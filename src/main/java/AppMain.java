public class AppMain {

    public static void main(String[] args) {

        int number = 30;

        checkCountGreaterThan30(number);

    }

    public static boolean checkCountGreaterThan30(int value){

        if (value > 30) {

            System.out.println("maximum number reached");
            return true;

        } else if (value == 30) {

            System.out.println("maximum number reached");
            return true;

        } else {

            System.out.println("maximum number not reached");
            return false;
        }

    }

}

