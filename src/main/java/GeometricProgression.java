import java.util.Scanner;

public class GeometricProgression {

    public static void main(String[] args)
    {
        Scanner number= new Scanner(System.in);

        System.out.println("AP Series");
        System.out.println("Enter a, d and n");

        int a = number.nextInt();
        int d = number.nextInt();
        int n = number.nextInt();

        int term = a;
        for(int i=0; i<n;i++)
        {
            System.out.print(term+ ",");
            term=term*d;
        }




    }

}
