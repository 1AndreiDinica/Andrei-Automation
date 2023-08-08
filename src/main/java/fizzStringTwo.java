public class fizzStringTwo {

    public static void main(String[] args){

        int a = 2;

       // String b = Integer.toString(a);
        String b = "";

//        if(a%3==0){
//            b = "Fizz";
//            System.out.println(b+"!");
//        }
//        if(a%5==0){
//            b = b + "Buzz";
//            System.out.println(b+"!");
//        }if(b==""){
//            b = Integer.toString(a);
//            System.out.println(b+"!");
//        }
        if (a%3==0 && a%5==0){
            System.out.println("FizzBuzz"+"!");
        } else if (a%3==0) {
            System.out.println("Fizz"+"!");
        } else if (a%5==0) {
            System.out.println("Buzz"+"!");
        }else {
            b = Integer.toString(a);
            System.out.println(b+"!");
        }

    }


}
