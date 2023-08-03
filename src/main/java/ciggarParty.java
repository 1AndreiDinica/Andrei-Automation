import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ciggarParty {

    public static void main (String[] args){

        LocalDateTime Date = LocalDateTime.of(2023, 8, 3, 0, 0);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E");
        String formattedDate = Date.format(dateFormat);

        System.out.println(formattedDate);

        Scanner sc = new Scanner(System.in);
        int Ciggar = sc.nextInt();

        if(Ciggar<40){
            System.out.println("False");
        }else if (formattedDate.equals("Sat") || formattedDate.equals("Sun")){
            System.out.println("True");
        }else if(Ciggar>60){
            System.out.println("False");
        }else {
            System.out.println("True");
        }




    }



}
