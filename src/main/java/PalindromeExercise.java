import java.util.Scanner;

public class PalindromeExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =scan.nextInt();


        int r;
        int rev = 0;
        int m=n;

        while (n>0)
        {
            r = n%10;
            rev = rev *10 +r;
            n=n/10;


        }if (rev==m)
        System.out.println("Number is a Palindrome " + m);
        else
            System.out.println("Number is not a Palindrome "+ m);

    }
}
