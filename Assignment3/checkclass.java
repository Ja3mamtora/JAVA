public class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion is eating meat");
    }
}

public class checkClass {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat();
    }
}