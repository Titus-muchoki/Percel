import java.util.Scanner;

public class Percel {
    public static void Volume(int weight, int dimention) {
        int percel = 0;
        if (percel == dimention) {
            System.out.println("");
            System.out.println("*************************************");
            System.out.println("Enter the your percel" + weight);
            System.out.println("Enter your dimention" + dimention);


            // weight+dimention =percel;
        }// else if (int total) {
            //System.out.println("return the total");

        else {
            System.out.println("the equaton is unknown");
        }
    }
    public static void costToShip(int cost) {
        int speed = 0;
        int dimention = 0;
        int weight = 0;
        int distance = 0;
        if ((cost == speed) || (cost == dimention) || (cost == weight) || (cost == distance)) {
          // int costToShip = (dimention,weight,distance, +speed)
            System.out.println("the total cost of ");
        } else {
            System.out.println("it is a wrong mathematical error");
        }
    }
    public static void main(String[] args){
        System.out.println("");
        System.out.println("************");
        System.out.println(1+"Continue");
        System.out.println(2+"Exit");
        Scanner mScanner = new Scanner(System.in);
        int userInput = mScanner.nextInt();
        Percel myObj =new Percel();
        if (userInput ==1) {
            System.out.println("");
            System.out.println("Enter the weight");
            int weight = mScanner.nextInt();
            System.out.println("");
            System.out.println("Enter the dimention");
            int dimention = mScanner.nextInt();
            System.out.println("");
            System.out.println("Return total weight + dimension");
            int total =mScanner.nextInt();
            total = userInput;
        } else if (userInput == 2) {
            System.out.println("good bye ");

        }else {
            System.out.println("unknown values");
        }


    }

        }
