public class firstLastSixArray {

       // Given an array of ints, return true if 6 appears as either the first or last element in the array.
       // The array will be length 1 or more.

       public static void main (String[] args) {

            int A[] = {6,1,2,3,5,6,7};
            int firstPosition = A[0];
            int lastPosition = A[A.length-1];

           if (firstPosition==6){

               System.out.println("True first");

           } else if (lastPosition == 6){
               System.out.println("True last");


           }else {

               System.out.println("Number 6 not found on the First or Last Position");

           }




       }


}
