import java.util.Arrays;

public class swapEnds {

    public static void main(String[] args){
        int [] a = {1,2,3,4,5,6,4};

        int first=a[0];
        int last = a[a.length-1];
        System.out.println(Arrays.toString(a));
        a[0]=last;
        a[a.length-1]=first;

        System.out.println(Arrays.toString(a));

    }

}
