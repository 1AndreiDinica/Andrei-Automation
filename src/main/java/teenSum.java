import java.util.Random;

public class teenSum {
    
    public static void main(String[] args){

        Random randomGenerator = new Random();
        
        int a = randomGenerator.nextInt(0,20);
        int b = randomGenerator.nextInt(0,20);

        System.out.println("Number a is " + a);
        System.out.println("Number b is "+ b);
        

        
        if (a>=13 && a<=19 || b>=13 && b<=19){
            System.out.println("Sum is 19");
        }else {
            int Sum;
            System.out.println(Sum=a+b);
        }
    }
    
}
