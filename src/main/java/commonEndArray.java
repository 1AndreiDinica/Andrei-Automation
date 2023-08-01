public class commonEndArray {

    public static void main(String[] args){

        int [] A = {1,2,3,4};

        int [] B ={2,2,3,4};

        int firstA = A[0];
        int lastA= A[A.length-1];

        int firstB = B[0];
        int lastB = B[B.length-1];

        if (firstA ==firstB || lastA == lastB){

            System.out.println("True");
        } else {

            System.out.println("First or Last numbers do not match");
        }


    }


}
