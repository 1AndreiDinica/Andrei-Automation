public class fizzString {

    public static void main(String[] args){

        String fizzBuzz = "fiboob";


        if(fizzBuzz.indexOf("f")==0 && fizzBuzz.lastIndexOf("b")==fizzBuzz.length()-1){
            System.out.println("FizzBuzz");
        }else if(fizzBuzz.indexOf("b")==fizzBuzz.length()-1){
            System.out.println("Buzz");
        }else if(fizzBuzz.indexOf("f")==0){
            System.out.println("Fizz");
        }else {
            System.out.println(fizzBuzz);
        }

    }

}
