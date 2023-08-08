import java.util.Random;

public class shareDigit {

    public static void main(String[] args){

        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt(10,99);
        int b = randomGenerator.nextInt(10,99);
        System.out.println("Number a is "+a);
        System.out.println("Number a is "+b);

        if(a/10==b%10 || b/10==a%10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}
