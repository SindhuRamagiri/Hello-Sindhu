package learn.code;

public class PoundToKg {

public static void main(String[] args ){
    double numberOfPounds = 200d;
    double convertedKilograms = numberOfPounds * 45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber =3000000.4567890d;
    System.out.println(pi);
    System.out.println(anotherNumber);

    //char
        char myChar = 'D';
        char myUnicodeChar ='\u0044';
    System.out.println(myChar);
    System.out.println(myUnicodeChar);
    char myCopyrightChar = '\u00A9';
    System.out.println(myCopyrightChar);
    //boolean
    boolean myTrueBooleanValue = true;
    boolean myFalseBooleanValue = false;

    boolean isCustomerOverTwentyOne = true;

    //String
    String myString ="This is my String";
    System.out.println(myString);
    myString = myString + ", and this is more";
    System.out.println("myString is equal to" + myString);
    String numberString = "250.20";
    numberString = numberString + "45.80";
    System.out.println(numberString);

    String lastString ="10";
    int myInt = 50;
    lastString = lastString + myInt;
    System.out.println("LastString is equal to " +lastString);
    double doubleNumber = 120.47d;
    lastString = lastString + doubleNumber;
    System.out.println("LastString is equal to" +lastString);



}
}
