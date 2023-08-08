public class reverseThreeArray {

    public static void main(String[] args) {

        int[] A = {1, 2, 3,4};


        for (int x : A)

            System.out.print(x + ",");
        System.out.println(" ");


        for (int i = 0; i < A.length / 2; i++) {
            int temp = A[i];

            A[i] = A[A.length - (1 + i)];
            A[A.length - (1 + i)] = temp;

        }
        for (int x : A)

            System.out.print(x + ",");
        System.out.println(" ");
    }
}
