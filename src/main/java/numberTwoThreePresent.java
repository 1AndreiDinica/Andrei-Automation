public class numberTwoThreePresent {



    public static void main (String[] args) {
        int A[] = {4,5};

        int firstPosition = A[0];
        int lastPosition = A[A.length - 1];

    for (int x : A)
      {
          System.out.println(x);
      }
        if (A[0] == 2 || A[A.length-1]==3 || A[0]==3 || A[A.length-1]==2){
            System.out.println("True it contains 2 or 3");
        }else {
            System.out.println("False does not contain 2 or 3");
        }






    }






}
