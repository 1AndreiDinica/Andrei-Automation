import java.util.Random;

public class inOrder {

    public static void main(String[] args){


        boolean bOk= true;


        int a = 1;
        int b = 1;
        int c = 2;

        System.out.println("Numbers are "+a+" ,"+b+" ,"+c);

        if(b>a && c>b){
            System.out.println("True");
        } else if(bOk && c>b){
            System.out.println("True");
        }else {
        System.out.println("False");

        }

    }

}
