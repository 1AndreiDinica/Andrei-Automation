public class extraEnd {


//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
//    The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static void main (String[] args){

        String extraEnd = "Z";


        if(extraEnd.length() >= 2){

            String copy= extraEnd.substring(extraEnd.length()-2);
            System.out.println(copy+copy+copy);

        }else if(extraEnd.length() <=1){

            String copy = extraEnd.substring(extraEnd.length()-1);
            System.out.println(copy+copy+copy);

        }


//        String copy= extraEnd.substring(extraEnd.length()-1);
//
//        System.out.println(copy+copy+copy);



    }

}
