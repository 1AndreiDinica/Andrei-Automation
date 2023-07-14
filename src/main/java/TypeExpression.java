public class TypeExpression {

    //Classes and Fields
    public static void main(String[] args) {
    Car myCar = new Car("Dacia");
    Car anotherCar = new Car("Volvo");

    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();
    anotherCar.brake();
    }

}


class Car {

    private int speed = 0;
    private String name;

    public Car(String carName)
    {
        name = carName;

    }

    public Car() {

    }

    public void accelerate(){
        speed++;
       showSpeed();
    }

    public void brake() {
        speed--;
        showSpeed();
    }

    private void showSpeed(){
        System.out.printf("%s is going %d miles per hour.%n",name, speed);
    }
}