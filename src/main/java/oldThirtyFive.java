public class oldThirtyFive {

    public static void main (String[] args){

        int a = 15;

        int n = 3;
        int z = 5;

        System.out.println("Number is "+a);

        if(a%n==0 && a%z!=0  || a%n!=0 && a%z==0){
           System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}
