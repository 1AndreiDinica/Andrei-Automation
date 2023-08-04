package org.example;

public class udemyMethodsThree {


    static boolean isPrime(int n)
    {
        for(int i= 2; i<n/2;i++)
        {
            if(n%2==0)
                return false;
        }
        return true;
    }


    static  int gcd (int m,int n){

        while (m!=n)
        {
            if(m>n) m =m-n;
            else n=n-m;
        }
        return m;
    }

//    public static void main(String [] args){
//
//        System.out.println(isPrime(101));
//
//    }

    public static void main (String[]args){

        System.out.println(gcd(25,15));


    }

}
