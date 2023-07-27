import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter key value");


        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        int k = key.nextInt();

        for (int i=0; i<A.length;i++)
        {
            if (k == A[i])
            {

                System.out.println("Element located at position "+i);
                System.exit(0);

            }
        }
    System.out.println("Not found");

    }
}

