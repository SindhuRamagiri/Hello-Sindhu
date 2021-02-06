package learn.code;

public class Example {
    public static void main(String[] args){
        double doubleValue1 = 20.00d;
        double doubleValue2 = 80.00d;

        double result = (doubleValue1 + doubleValue2) * 100.00d;
        System.out.println("result =" +result);

        //reminder operator
         double reminderValue = result % 40d;
        System.out.println("reminderValue =" +reminderValue);
        boolean isNoReminder = (reminderValue == 0) ? true: false;
        System.out.println("isNoReminder =" + isNoReminder);
        if(!isNoReminder){
            System.out.println("Got some reminder");
        }

    }
}
