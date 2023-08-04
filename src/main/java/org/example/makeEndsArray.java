package org.example;

public class makeEndsArray {

    public static void main (String[] args){

        int [] A = {1,2,3,4,5,6};

        int [] first = new int[]{A[0]};
        int [] last = new int []{A.length};


        int [] firsLast = new int[first.length+last.length];
        System.arraycopy(first, 0, firsLast, 0, first.length);
        System.arraycopy(last, 0, firsLast, first.length, last.length);
        System.out.println("New String : ");

        for (int x: firsLast){

            System.out.print(x + " ");
        }


    }



}
