import java.util.Random;

public class dateFashionExer {

    public static void main(String[] args){

        Random randomGenerator = new Random();


      int you = randomGenerator.nextInt(10);

      int date = randomGenerator.nextInt(10);

        System.out.println("Number for you is "+you);
        System.out.println("Number for date is "+date);

        if (you<=2 || date<=2){
            System.out.println("0");
        }else if(you >=8 || date>=8){
            System.out.println("2");
        }else {
            System.out.println("1");
        }





    }
}
