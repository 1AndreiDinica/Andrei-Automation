public class hasBad {

   // Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
   // The string may be any length, including 0. Note: use .equals() to compare 2 string
    public static void main(String [] args) {

        String hasBad = "xbadz";


        if (hasBad.indexOf("bad")==0 || hasBad.indexOf("bad")==1){

            System.out.println("True");


        } else {

            System.out.println("False");

        }

    }

}
