public class withoutEndTwo {

    public static void main(String[] args) {

        String endTwo = "Tac";


        //  String eT = endTwo.substring(1,endTwo.length()-1);

        // System.out.println(eT);

        if (endTwo.length() >= 2) {

            String eT = endTwo.substring(1, endTwo.length() - 1);

            System.out.print(eT);

        } else if (endTwo.length() <= 2) {

            System.out.println(" ");

        }

    }
}
