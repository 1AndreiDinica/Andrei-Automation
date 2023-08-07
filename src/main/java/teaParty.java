import java.util.Random;

public class teaParty {

    public static void main(String[] args) {

        Random randomGenerator = new Random();


        //int tea = randomGenerator.nextInt(10);
        //int candy = randomGenerator.nextInt(10);

        int tea = 4;
        int candy = 18;


        System.out.println("Number for tea is " + tea);
        System.out.println("Number for candy is " + candy);

        if (candy >= 5 && tea >= 5) {
            if (candy * 2 <= tea || tea * 2 <= candy) {

                System.out.println("2");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
