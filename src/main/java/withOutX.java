public class withOutX {


    //Given a string, if the first or last chars are 'x',
    // return the string without those 'x' chars,
    // and otherwise return the string unchanged.
    public static void main (String[] args) {

        String withoutX = "" ;



        if (withoutX.length()>0){
            if(withoutX.indexOf("x")==0)
            {

                withoutX = withoutX.substring(1,withoutX.length());

            }
            if (withoutX.indexOf("x")==withoutX.length()-1 ){

                withoutX = withoutX.substring(0,withoutX.length()-1);


            }


        }

       System.out.println("The string is: '"+withoutX+"'");


    }

}
