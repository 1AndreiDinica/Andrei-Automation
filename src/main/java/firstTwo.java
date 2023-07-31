public class firstTwo {


    public static void main (String[] args) {

        String firstTwo = "" ;

        if (firstTwo.length()>=2){

            System.out.println(firstTwo.substring(0,2));


        }
        if(firstTwo.length()==1){

            System.out.println(firstTwo.substring(0));



        }else if(firstTwo.length()==0){

            System.out.println("yields the empty string");
        }



    }



}
