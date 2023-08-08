import java.util.Arrays;

public class maxEndThree {
    public static void main(String[] args){

        int [] three = {4,2,3};

        int max = 0;

        if(three[0]<three[2]){
            max = three[2];
        }else {
            max = three[0];
        }
        for (int i=0; i<three.length;i++){
            three[i] = max;

        }
        System.out.print(Arrays.toString(three));

    }

}
