package main;

public class CarTest {
    public static void main(String[] args) {
        Car firstCar = new Car("Genesis");
        Car secondCar = new Car("Genesis");

        if(firstCar.equals(secondCar)) {
            System.out.println("They are same.");
        } else {
            System.out.println("They are not same.");
        }
    }
}
