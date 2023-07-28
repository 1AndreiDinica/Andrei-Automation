import java.util.Scanner;

public class CNPValidationVersionTwo {

    public static void main(String[] args) {

        // input cnp to check
        System.out.println("Enter CNP numbers");

        Scanner sc = new Scanner(System.in);
        String inputCnpString = sc.next();
        String[] stringArray = new String[13];
        stringArray = inputCnpString.split("");

        // convert string cnp to int
        int cnpLength = 13;
        int[] inputCnp = new int[13];
        for (int i = 0; i < cnpLength; i++) {
            inputCnp[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println("CNP numbers are");
        for (int i = 0; i < cnpLength; i++) {
            System.out.print(inputCnp[i]);
        }

        int controlCnp[] = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
        System.out.println(" Control CNP is ");
        for (int i = 0; i < cnpLength - 1; i++) {
            System.out.print(controlCnp[i]);
        }

        System.out.println();

        // calculate sum
        int sum = 0;
        for (int i = 0; i < cnpLength - 1; i++) {
            sum = sum + inputCnp[i] * controlCnp[i];
        }
        System.out.println("CNP Sum = " + sum);

        // check sum
        int control = 11;
        int controlDigit = sum % control; //rest/remainder
        System.out.println("Control Digit = " + controlDigit);

        if (controlDigit == inputCnp[cnpLength - 1]) {
            System.out.println("CNP is Valid");
        } else {
            System.out.println("CNP is Invalid");
        }

    }
}