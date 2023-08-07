import java.util.Random;

public class inOneToTen {
    //Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
    // in which case return true if the number is less or equal to 1,
    // or greater or equal to 10.


    public static void main (String[] args){

        boolean outsideMode = true;

//        Random randomGenerator = new Random();
//        int x = randomGenerator.nextInt(1,10);
        int x = 1;

        if(outsideMode){
            if(x<=1 || x>=10){
                System.out.println("True");

            }else {
                System.out.println("False");
            }

        }


    }
}
