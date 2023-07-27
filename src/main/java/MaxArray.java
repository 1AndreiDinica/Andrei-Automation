public class MaxArray {



    public static void main(String[] args) {
        int A[] = {11, 3, 6, 7, 8, 9, 23, 44, 88};

        int max = A[0];
        for (int i =0; i<A.length;i++)
        {
            if (A[i]>max);
            max =A[i];
        }

        System.out.println(max);
    }


}
