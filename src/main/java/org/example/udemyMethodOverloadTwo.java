package org.example;

import java.util.Arrays;

public class udemyMethodOverloadTwo {

     static double area (double radius)
     {
         return Math.PI * radius * radius;
     }

     static double area ( double length,double breadth)
     {
         return length * breadth;
     }
     static int reverse(int n)
     {
         int rev = 0;

         while (n!=0)
         {
             rev = rev *10 +n%10;
             n=n/10;
         }
         return rev;
     }

     static int [] reverse(int A[])
     {
         int B [] = new int[A.length];

         for(int i=A.length-1,j=0;i>=0;i--,j++)
             B[j]=A[i];
         return B;
     }

    static boolean validate(String name){
         return name.matches("[a-zA-Z\\s]+");
     }

     static boolean validate(int age)
     {
         return age >= 3 && age <=15;
     }

     public static void main(String[] args){

      String name = "Marian";
      int age = 5;

      System.out.println(validate(name) && validate(age));


     }


}
