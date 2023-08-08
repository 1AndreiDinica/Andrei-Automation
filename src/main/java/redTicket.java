import java.util.Random;

public class redTicket {

    public static void main(String [] args) {

        Random randomGenerator = new Random();

        int a = 0;

        int b = 1;

        int c = 1;

        if (a == 2 && b == 2 && c == 2) {

            System.out.println("10");

        } else if (a == b && b == c && c == a)
        {
            System.out.println("5");
        }else if(b!=a && c!=a){
            System.out.println("1");
        }else {
            System.out.println("0");
        }







    }

}
