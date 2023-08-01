public class swapLastTwo {

    public static void main(String[] args){

        String swap = "";

        if(swap.length()>=2){

            String swapOne = swap.substring(swap.length()-1);
            String swapTwo = swap.substring(swap.length()-2,swap.length()-1);
            String swapThree =swap.substring(0,swap.length()-2);

            System.out.println(swapThree+swapOne+swapTwo);


        }else {
            System.out.println("String is"+"'"+swap+"'");

        }

    }

}
