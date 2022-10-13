package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    // Implement all methods as public static

    public static void largestNum(){
        double num;
        double largestnum =0;
        int counter = 1;
        Scanner scanner;
        scanner = new Scanner(System.in);
        do{



            System.out.print("Number "+counter+": ");
            num = scanner.nextDouble();
            if(counter == 1 && num <=0) {
                System.out.println("No number entered.");
                return;
            }
            else if (num > largestnum){
                largestnum = num;

            }

            counter++;

        }while(num != 0);
        String largestnumformatted = String.format("The largest number is %.2f",largestnum);
        System.out.print(largestnumformatted);


    }
    public static void oneMonthCalender (int numberDay, int startingDay){

    }
    public static long[] lcg(long seed){

        long[] randomNumbers = new long[10];

        return null;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        largestNum();
    }
}