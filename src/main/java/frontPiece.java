import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args){
        int [] a ={1};


        int [] c;
        int length;
        if (a.length>=2) {
            length = 2;
        }else {
            length = a.length;
        }

        c = new int[length];
        System.arraycopy(a, 0, c, 0, length);

        System.out.println(Arrays.toString(c));
        }
    }



