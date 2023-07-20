import java.util.Scanner;

public class StatementSwitch {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String userChoice;

        System.out.println("Please choose one of the following options");
        System.out.println("1- Cappucino");
        System.out.println("2- Latte");
        System.out.println("3- Americano");
        System.out.println("4- Mocha");
        System.out.println("5- Macchiato");
        System.out.println("Q- Quit the Program");

        do {
            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose "+userChoice);
            switch (userChoice) {
                case "1":
                    System.out.println("Making Cappucino...");
                    System.out.println("Steam the milk");
                    System.out.println("Froth the milk");
                    System.out.println("Make espresso");
                    System.out.println("Add the milk to the espresso");
                    break;
                case "2":
                    System.out.println("Making Latte");
                    System.out.println("Making espresso");
                    System.out.println("Steam the milk");
                    System.out.println("Add the milk to the espresso");
                case "3":
                    System.out.println("Making Americano...");
                    break;
                case "4":
                    System.out.println("Making Machiato...");
                    break;
                case "5":
                    System.out.println("Making Espresso...");
                    break;
                default:
                    System.out.println("Returning coins");
                    continue;


            }

            System.out.println("Dispensing coffee");
            System.out.println("Have a nice day!");

        } while (!userChoice.equals("q"));



        scanner.close();

    }
}
