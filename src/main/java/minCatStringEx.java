public class minCatStringEx {

    public static void main (String[] args){

        String first = "Hellz";

        String second = "Java";


        if (first.length() == second.length()){
            System.out.println("Both are equal new string is :");
            System.out.print(first+second);

        }else if (first.length()<second.length()){
            System.out.println("Second String is bigger reducing to match First");
            int n = first.length();
            System.out.println(second.substring(0,n)+first);

        }else if(second.length()<first.length()){
            System.out.println("First String is bigger reducing to match second");
            int n = second.length();
            System.out.println(first.substring(0,n)+second);


        }



    }



}
