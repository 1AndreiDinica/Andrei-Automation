public class lastDigit {

    public static void main(String[] args){

        int a = 23;

        int b = 19;

        int c =3;

        int n = 10;

        System.out.println("Numbers are "+a+", "+b+", "+c);

        if(a%n==b%n || a%n==c%n || b%n==c%n){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}
