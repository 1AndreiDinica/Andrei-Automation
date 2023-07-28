public class withoutEnd {


    //Given a string, return a version without the first and last char, so "Hello" yields "ell".
    // The string length will be at least 2.
    public static void main(String[] args){

        String withoutEnd = "H";

        //String end = withoutEnd.substring(2);

        //System.out.println(end);
        if(withoutEnd.length() >= 2){

            String end= withoutEnd.substring(2);

            System.out.print(end);

        }else if(withoutEnd.length() <=1)
        {

            System.out.println("Word is to short");

        }

    }

}
