public class AppMain {

    public static void main(String[] args) {

        int number = 60;
        String Alarm = "green";

        System.out.println(checkAlarmSignalAndCapacity(number, Alarm));

    }


    public static String checkAlarmSignalAndCapacity(int capacity, String alarmSignal){

        switch (alarmSignal){

            case "red":

                if (capacity > 0) {
                    return "maximum number reached.";
                }
                    return "maximum number not reached.";

            case "yellow":

                return checkCapacityToAlarmsignal(30, capacity);

            case "green":

                    return checkCapacityToAlarmsignal(60, capacity);

            default:

                    return "unknown Alarm.";

        }


    }
    public static String checkCountGreaterThan30(int capacity){

        if (capacity > 30) {

            return "maximum number reached.";

        } else if (capacity == 30) {

            return "maximum number reached.";

        } else {

            return "maximum number not reached.";
        }

    }

    public static String checkCapacityToAlarmsignal(int allowedCapacity, int actualCapacity){

        if (actualCapacity > allowedCapacity) {

            return "maximum number reached.";

        }

        return "maximum number not reached.";
    }

}