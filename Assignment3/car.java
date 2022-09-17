interface Vehicle {
    public void wheels();

    default void fuel() {
        System.out.println("It reguires fuel");
    }
}

public class Car implements Vehicle {
    public void wheels() {
        System.out.println("Car has 4 wheels");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.wheels();
        c1.fuel();
    }
}
