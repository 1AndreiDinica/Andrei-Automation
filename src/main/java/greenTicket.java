public class greenTicket {

    public static void main(String[] args){

        int a = 2;
        int b = 2;
        int c = 2;

        if(a==b && b==c){
            System.out.println("20");
        }else if (a==b || b==c || c==a){
            System.out.println("10");
        }else {
            System.out.println("0");
        }



    }

}
