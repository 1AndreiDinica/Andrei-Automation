public class fixTwoThreeChange {

    public static void main(String[] args){


        int [] A = {1, 1 , 2, 3, 5,6};


        for (int i=0; i<A.length; i++){

            if(A[i]==2 && A[i+1]==3) {

                A[i+1] = 0;
            }
        }
        for (int x:A)

        {
            System.out.println(x);
        }


    }

}
