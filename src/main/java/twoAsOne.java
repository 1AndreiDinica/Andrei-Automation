public class twoAsOne {

    public static void main(String [] args) {

        int a = 3;

        int b = 1;

        int c = 3;

        System.out.println("Numbers are "+a+", "+b+", "+c);

        if(a+b==c){
            System.out.println("True");
        }else if (a+c==b){
            System.out.println("True");
        }else if (c+b==a){
            System.out.println("True");
        }else {
            System.out.println("False");
        }



    }

}
