public class middleTwo {

    public static void main(String[]args){


        String middleTwo = "Pa";

        String firsthalf = middleTwo.substring(0,middleTwo.length()/2);
        String lasthalf  = middleTwo.substring(middleTwo.length()/2);

        if(firsthalf.length()>=3 && lasthalf.length()>=3) {
            String middle = firsthalf.substring(firsthalf.length() - 1) + lasthalf.substring(0, 2);

            System.out.println(middle);
        }else if(firsthalf.length()>=2 && lasthalf.length()>=2){

            String middle = firsthalf.substring(1) + lasthalf.substring(0,1);

            System.out.println(middle);

        }else if(firsthalf.length()<=1 && lasthalf.length()<=1)
        {

            String middle = firsthalf+lasthalf;
            System.out.println(middle);

        }



    }

}
