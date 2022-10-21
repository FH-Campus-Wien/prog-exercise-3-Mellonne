package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
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

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        lcg(2);

    }
}