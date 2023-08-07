import java.util.Random;
import java.util.random.RandomGenerator;

public class moreTwenty {

    public static void main(String[] args){

        boolean isTwenty = true;

        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(0,1000);

        System.out.println(a);

        int difference = a%20;
        if(isTwenty){
            if (difference == 1 || difference == 2){
                System.out.println("True and the difference is " + difference);
            }else {
                System.out.println("False");
            }


        }


    }


}
