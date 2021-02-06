package learn.code;

public class IfwithOpeators {

    public static void main(String[] args){
        int topScore = 80;
        if(topScore < 100)
            System.out.println(" you got the High score!");

        // and operator
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <100){
        System.out.println("Greater Than second top score and less than 100");
        }

        int thirdTopScore =82;
        if((topScore < thirdTopScore) && (topScore  < 100))
            System.out.println("Less Than thirdTopScore and less Than 100");

        // or operator
        if((topScore > 90) || (secondTopScore<=90))
            System.out.println("Either or both of the conditions are true");

        // assignment operator
        int newValue = 50;
        if(newValue == 50)
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar == true){
            System.out.println("this is not supposed to happen");
        }
        //terinary operator
        boolean isBike = true;
        boolean wasBike = isBike ? true : false;
        if(wasBike){
            System.out.println("wasBike is true");
        }

    }

}
