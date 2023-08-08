public class sumLimit {

    public static void main(String[] args){

        int a = 22;
        int b = 12;
        int sum= a+b;

        String aString = String.valueOf(a);

        String sumString = String.valueOf(sum);


        if(sumString.length() == aString.length()){
            System.out.println(sum);
        }else {
            System.out.println(a);
        }

    }

}
