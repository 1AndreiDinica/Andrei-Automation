import java.util.Random;

public class specialEleven {

    public static void main(String[] args){


        Random randomGenerator = new Random();

        int a = randomGenerator.nextInt(11,1000);

        System.out.println(a);

        if (a%11==0 || a%11==1){

            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }

}
