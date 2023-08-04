package org.example;

public class udemyMethodsTwo {

    static void update(int A[]) {


        A[0] = 25;
    }

    int max(int x, int y)
    {
        return x>y? x:y;
    }
    public static void main(String args []){

        int A[] = {2,3,4,5,6};

        update(A);

        for ( int x : A)
        {
            System.out.println(x);
        }



    }

}
