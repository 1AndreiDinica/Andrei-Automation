public class conCat {

    public static void main(String[] args){

        String aplha = "catz";
        String beta = "tank";


        String firstchar = aplha.substring(aplha.length()-1);
        String lastchar = beta.substring(0,1);

        if (firstchar.equals(lastchar))
        {

            System.out.println(aplha.substring(0,aplha.length()-1)+beta);

        } else {
            System.out.printf(aplha + beta);
        }





    }

}
