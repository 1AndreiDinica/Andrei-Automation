import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class squirrlePlayExe {

    public static void main(String[] args){

        Random randomGenerator = new Random();
        boolean isSummer= randomGenerator.nextBoolean();
        System.out.println(isSummer);

        Scanner sc = new Scanner(System.in);
        int  temp = sc.nextInt();

        if(temp<60){
            System.out.println("False");
        }else if (isSummer && temp <=100){
            System.out.println("True");
        }else if(temp<=90){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}
