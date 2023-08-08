import java.util.Arrays;

public class makePie {

    public static void main(String [] args){

        double pie =Math.PI;
        String roundPie = String.valueOf(Math.round(pie * 100));


        String[] stringArray = roundPie.split("");


        System.out.println(Arrays.toString(stringArray));


    }
}
