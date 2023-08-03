public class sumTwoArray {

    public static void main (String[] args){

        int [] A = {3};

        int sum = 0;
        if (A.length>=2) {

            sum = A[0] + A[1];

            System.out.print("Sum is :");
            System.out.println(sum);

        }else if(A.length==1){

            sum =A[0];
            System.out.print("Sum is :");
            System.out.println(sum);
        }else if(A.length==0){

            sum = A.length;
            System.out.print("Sum is :");
            System.out.println(sum);
        }


    }


}
