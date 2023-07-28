import java.lang.reflect.Array;
import java.util.Scanner;

public class CNPValidation {


    public static void main(String[] args) {

        int n;
        int cnp[] = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CNP length ");
        n = sc.nextInt();

        int[] array = new int[13];

        System.out.println("Enter CNP numbers");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("CNP numbers are");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            System.out.println("");
        }

        int control = 11;
        int sum = 0;
        for (int j : array) {

            sum = array[0] * cnp[0] + array[1] * cnp[1] + array[2] * cnp[2] + array[3] * cnp[3] + array[4] * cnp[4] + array[5] * cnp[5] + array[6] * cnp[6] + array[7] * cnp[7] + array[8] * cnp[8] + array[9] * cnp[9] + array[10] * cnp[10] + array[11] * cnp[11];

        }
        sum = sum % control;
        if (sum == array[12]) {
            System.out.println("CNP is Valid");

        } else {
            System.out.println("CNP is Invalid");
        }

        System.out.println("Control number matches " + sum)
        ;

    }

}

