public class maxModFive {

    public static void main(String[] args){

        int a = 3;
        int b = 2;

        int n = 5;

        System.out.println("Numbers are "+a+", "+b);

        if (a == b){
            System.out.println("0");
        }else if (a%n==b%n){
            System.out.println(Math.min(a,b));
        }else {
            System.out.println(Math.max(a,b));
        }

    }

}
