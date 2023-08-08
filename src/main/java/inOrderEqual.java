import java.util.Arrays;

public class inOrderEqual {

    public static void main(String[] args) {

        boolean equalOk = true;

        int a = 5;

        int b = 9;

        int c = 7;
        System.out.println("Numbers are "+a+" ,"+b+" ,"+c);

        if(equalOk){
            if(a<=b && b<=c){
                System.out.println("True");

            }else {
                System.out.println("False");
            }
        }else if(a<b && b<c){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }


}
