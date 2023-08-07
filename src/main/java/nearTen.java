import java.util.Random;

public class nearTen {

    public static void main(String[] args){

        boolean isTen = true;

        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(1,10);
        int n = randomGenerator.nextInt(1,10);
        System.out.println("Number is " + a);
        System.out.println("Divider is " + n);

        int num = a%n;
        System.out.println("Remainder is " + num);

        if(isTen) {
            if (num <3 || num>=8) {
                System.out.println("True");
            } else {
                System.out.println(false);
            }

            System.out.println(num );
        }
    }

}
