public class SecondMaxArrayElement {
    public static void main(String[] args) {

        int A[] = {1, 5, 87, 33, 22, 13, 111, 66, 77, 8, 3, 45};

        int max1, max2;
        max1 = max2 = A[0];
        for (int i = 0; i < A.length; i++)

            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2)
            {
                max2 = A[i];


            }
     System.out.println("Second largest element " + max2);
    }

}