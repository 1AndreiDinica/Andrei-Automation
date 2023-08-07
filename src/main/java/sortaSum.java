import java.util.Random;

public class sortaSum {

    public static void main(String[] args){

        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt(0,12);
        int b = randomGenerator.nextInt(0,12);

        int sum = a+b;

        if(sum>10 && sum<=19)
        {
            System.out.println("Total sum is 20");
        }else {
                System.out.println("Total sum is " + sum);
        }


        }

    }


