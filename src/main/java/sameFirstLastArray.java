public class sameFirstLastArray {

    public static void main (String[] args) {

        int [] firstlast = {1,2,3,4,5,6,1};

        int first=firstlast[0];
        int last = firstlast[firstlast.length-1];


        if ( first == last){

            System.out.println("True");
        }else{
            System.out.println("False");
        }




    }

}
