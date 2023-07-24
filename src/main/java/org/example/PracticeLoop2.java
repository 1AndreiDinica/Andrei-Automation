package org.example;

import java.util.Scanner;

public class PracticeLoop2 {

    public static void main(String[] args ){

        Scanner number = new Scanner(System.in);
        System.out.println("Add number");
        int n = number.nextInt();


        int sum = 0;

        for(int i=1; i<=n;i++) {

            sum = sum + i;
        }

            System.out.println("Sum of "+n+" Number is "+sum);




    }
}
