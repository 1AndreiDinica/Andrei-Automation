public class missAtFirst {


    public static void main(String[]args){

        String name = "R";

        if (name.length()>=2){

            System.out.println(name.substring(0,2));
        }else if(name.length()<2){

            System.out.println(name.substring(0,1)+"@");
        }


    }

}
