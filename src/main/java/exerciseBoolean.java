public class exerciseBoolean {

    public static void main(String [] args) {

        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;
        // Any variable will work inside the ? because the first statement is true due to ! operator in the first one which reverses the result
        // and || which returns true if one statement is true
        System.out.printf(String.valueOf(((rightTurn && !pedestrian || otherLane) || (rightTurn && !pedestrian && greenLight)) == true));
    }
}
