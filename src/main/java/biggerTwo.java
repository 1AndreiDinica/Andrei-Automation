import java.util.Arrays;

public class biggerTwo {
    public static void main(String [] args){

        int [] a ={3,4};
        int [] b ={5,2};

        int sum = a[0] + a[1];
        int sumtTwo = b[0]+b[1];

        if(sum<sumtTwo){
            System.out.println(Arrays.toString(b));
        }else{
            System.out.println(Arrays.toString(a));
        }
    }
}
