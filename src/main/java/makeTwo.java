import java.util.Arrays;

public class makeTwo {

    public static void main(String[] args){

            int [] a ={1};
            int [] b ={};

            int [] c = new int[2];
            int initial;
            if (a.length + b.length >=2) {

                if (a.length < 2) {
                    initial = a.length;
                } else {
                    initial = 2;
                }

                System.arraycopy(a, 0, c, 0, initial);
                if (c.length - initial > 0) {
                    System.arraycopy(b, 0, c, a.length, c.length - initial);
                }
                System.out.println(Arrays.toString(c));

            }else {
                System.out.println("Not enough room boss");
            }
    }
}
