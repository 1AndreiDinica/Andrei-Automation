public class nTwice {



   // Given a string and an int n, return a string made of the first and last n chars from the string.
    //The string length will be at least n.
    public static void main (String[] args){


        String nTwice = "Hello";

        int n = 4;



    if (nTwice.length()>=n){

        String combo = nTwice.substring(0,n);
        String comboTwo = nTwice.substring(nTwice.length()-n);
        System.out.println(combo+comboTwo);

    } else if (nTwice.length()<n) {

        System.out.println("n must be at least the length of nTwice");
    }
    }

}
