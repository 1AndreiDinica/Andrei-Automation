import java.util.Random;

public class loveSix {

    public static void main(String[] args) {

        boolean isSix = true;

        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt(-10,10);
        int b = randomGenerator.nextInt(-10,10);

//        int a = -4;
//        int b = -2;


        System.out.println("Number for a is " + a);
        System.out.println("Number for b is " + b);

        int sum = a+b;
        int difference = Math.abs(a-b);
        int differenceTwo = Math.abs(b-a);

        if (isSix) {
            if (a == 6 || b == 6) {
                System.out.println("True one of the values is 6");
            } else if (difference == 6 || differenceTwo == 6) {
                System.out.println("True the difference is 6");
            } else if (sum == 6) {
                System.out.println("True the sum is 6");
            } else {
                System.out.println("False");
            }

        }

    }
}
