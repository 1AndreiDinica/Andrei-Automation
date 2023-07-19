public class builderStrng {

    public static void main (String[] args) {

        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = first;

        System.out.printf("first: %s %n",first);
        System.out.printf("second: %s %n",second);
        System.out.printf("first is the same as second: %s %n", first == second );

        System.out.println();

        first = first.replace(4,5,"_");
     //   first = first.replace("_","");
        System.out.printf("first: %s %n",first);
        System.out.printf("second: %s %n",second);
        System.out.printf("first is the same as second: %s %n", first == second );
        System.out.printf("first.equals(second): %s %n",first.equals(second));

    }
}
