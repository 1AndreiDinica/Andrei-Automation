public class blueTicket {

    public static void main(String[]args){

     int a = 6;
     int b = 1;
     int c = 4;



     if(a+b==10 || a+c==10 || b+c==10){

         System.out.println("Sum is 10");
     }else if(a+b==10+(b+c) || a+b==10+(a+c) ){
         System.out.println("Sum is 5");
     }else {
         System.out.println("0");
     }


    }

}
