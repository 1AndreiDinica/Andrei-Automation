import java.util.Arrays;

public class plusTwo {

    public static void main(String[] args){
        int [] a ={1,2};
        int [] b ={2,3};

        int [] c = new int[4];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c));




    }

}
