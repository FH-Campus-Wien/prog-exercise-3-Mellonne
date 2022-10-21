package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    public static void guessingGame(int numberToGuess){
        Scanner scanner;
        scanner = new Scanner(System.in);
        int goalnumber = numberToGuess;
        for(int i=1;i<=10;i++)
        {
            int guess;
            int counter =1;
            if(i<10) {

                System.out.print("Guess number "+i+": ");
                guess = scanner.nextInt();
                if(guess == goalnumber){
                    System.out.println("You won wisenheimer!");
                    break;
                }
                else if(guess < goalnumber){
                    System.out.println("The number AI picked is higher than your guess.");
                }
                else if (guess > goalnumber) {
                    System.out.println("The number AI picked is lower than your guess.");
                }
            }
            else if(i == 10)
            {
                System.out.print("Guess number "+i+": ");
                guess = scanner.nextInt();
                if(guess == goalnumber){
                    System.out.println("You won wisenheimer!");
                    break;
                }
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
        }
    }
    public static void oneMonthCalendar(int numberDay, int startingDay)
    {
        int row = 0;
        int column = 0;

        for(int a = 1; a <=7; a++){
            if(a == startingDay){
                for(int i =1; i<=numberDay;i++){
                    System.out.printf("%,2d ",i);
                    column++;
                    if(column%7 == 0){
                        if(row <=4){
                            System.out.println("");
                        }
                        row++;

                    }
                }
            }else if(column<startingDay){
                System.out.print("   ");
                column++;
            }
            if(numberDay<=2){
                System.out.print("");
            }


        }
        if(column%7!=0){
            System.out.println();
        }
    }
    public static long[] lcg(long seed){
        long m = 2^31;
        long a = 1103515245;
        long c = 12345;
        long randomNumber[];
        long counter = 0;
        randomNumber = new long[10];
        /*for (int i = 0; i<=10; i++) {
            counter = counter +1;
            randomNumber[(int)counter] = (int)((a * seed) + c) % m;
            System.out.println(randomNumber[(int)counter]);
        }
        */

        return randomNumber;
    }
    public static int checkDigit(int[] numbers){
        int[] weighting = new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
        {
            weighting[i]=i+2;
        }
        int sum=0;
        for (int i=0;i< numbers.length;i++)
        {
            sum = sum + (weighting[i]*numbers[i]);
        }
        int restNum = sum%11;
        int verificationNum =11-restNum;
        if (verificationNum==10)
        {
            return 0;

        }else if(verificationNum==11)
        {
            return 5;
        }else
        {
            return verificationNum;
        }
    }
     public static boolean swapArrays(int[] arr1, int[] arr2)
    {

        boolean booleanFlag;

        System.out.println(arr1[1]);
        if(arr1.length!=arr2.length)
        {
           booleanFlag = false;
        }
        else{
            int[] arrtemp;
            arrtemp = new int[arr1.length];
            for(int i =0; i <=arr1.length;i++)
            {
                arrtemp[i] = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = arrtemp[i];
            }
            booleanFlag = true;
        }
        return booleanFlag;
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
        int[] arr1 = {0,6,37,8,9};
        int[] arr2 = {1,2,3,4,5};

        //lcg(2);
        oneMonthCalendar(31,3);
        guessingGame(76);

    }
}