public class deFrontString {

    public static void main (String[] args){

        String front = "away";



        if(front.indexOf("a")==0 && front.indexOf("b")==1){

            System.out.println(front);

        }else if(front.indexOf("a")==0){

            System.out.println(front.substring(0,1)+front.substring(2));
        } else if(front.indexOf("b")==1){

            System.out.println(front.substring(1));
        }else {
            System.out.println(front.substring(2));
        }



    }

}
