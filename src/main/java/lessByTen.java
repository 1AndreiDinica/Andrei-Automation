public class lessByTen {

    public static void main(String[] args){

        int a = 1;

        int b = 7;

        int c = 11;

        int  high = Math.max(a,b);
        high = Math.max(high,c);

        if(high - a>=10 || high - b>=10 || high-c >=10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }

}
