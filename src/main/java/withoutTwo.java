public class withoutTwo {

    public static void main (String[] args){

        String withoutTwo = "HihelloHi";


        String firstchar = withoutTwo.substring(0,2);
        String lastchar = withoutTwo.substring(withoutTwo.length()-2);

        if(firstchar.equals(lastchar))
        {

            System.out.println(withoutTwo.substring(2,withoutTwo.length()));

        } else {

            System.out.println(withoutTwo);
        }


    }

}
