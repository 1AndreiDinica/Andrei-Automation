import java.util.Scanner;

public class PracticeLoop3 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Add number");
        int n = number.nextInt();

        long fact = 1;

        for (int i=1; i<=n;i++)
        {

        fact = fact *i;

        }
        System.out.println("Factorial is " + fact);

    }
}
