import java.util.Arrays;
import java.util.logging.XMLFormatter;

public class withOutXTwo {
    public static void main(String[] args) {

        String[] xContainz = {"xhi", "Hxi", "xxH", "xHx", "xx", "x",""};

        int length = xContainz.length - 1;

        for (int i = 0; i <= length; i++) {

            System.out.println("Original string is:" + xContainz[i]);

            if (xContainz[i].length() > 1 && xContainz[i].charAt(1) == 'x') {

                xContainz[i] = xContainz[i].charAt(0) + xContainz[i].substring(2);
            }

            if (xContainz[i].indexOf("x") == 0)
            {
                xContainz[i] = xContainz[i].substring(1);

            }
            System.out.println("Modified string is:" + xContainz[i]);
            System.out.println();
        }

    }
}
