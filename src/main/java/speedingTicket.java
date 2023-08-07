import java.util.Random;
import java.util.Scanner;

public class speedingTicket {


    public static void main(String[] args){


        boolean isBirthday= false;
        System.out.println(isBirthday);

        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if (!isBirthday) {
            if (speed <= 60) {
                System.out.println("0");
            } else if (speed >= 61 && speed <= 80) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } else {
            if (speed <= 65) {
                System.out.println("0");
            } else if (speed >= 66 && speed <= 85) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }

    }


}
