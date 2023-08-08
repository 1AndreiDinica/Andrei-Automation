import java.util.Random;

public class lessTwenty {

    public static void main(String[] args) {

        boolean isTwenty = true;

        Random randomGenerator = new Random();
        int a = 38;
        int n = 20;
        System.out.println("Number is " + a);
        System.out.println("Divider is " + n);

        int num = a % n;
        System.out.println("Remainder is " + num);

        if (isTwenty) {
            if (num == 18 || num == 19) {
                System.out.println("True");
            } else {
                System.out.println(false);
            }

            System.out.println(num);
        }
    }
}
