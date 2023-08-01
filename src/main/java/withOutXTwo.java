import java.util.Arrays;
import java.util.logging.XMLFormatter;

public class withOutXTwo {


    public static void main(String[] args) {

        String[] xContainz = {"xhi", "Hxi", "xxH", "xHx", "xx", "x"};


        int length = xContainz.length - 1;

        for (int i = 0; i <= length; i++) {

            String xContains = xContainz[i];

            System.out.println("Original string is:" + xContains);

            if (xContains.indexOf("x") == 0) {

                xContains = xContains.substring(1);


            }
            if (xContains.indexOf("x") == 1) {

                xContains = xContains.substring(0) + xContains.substring(2);
            }
            System.out.println("Modified string is:" + xContains);
        }

    }
}
