public class maxTriple {

    public static void main(String[] args){

        int [] a = {1,0,5,2,3};

        int one = a[0];
        int two =a[a.length/2];
        int three=a[a.length-1];


       int  high = Math.max(one,two);
       high = Math.max(high,three);

       System.out.println(high);

    }

}
