interface p {
    final int p = 67;

    void display1();
}

interface p1 extends p {
    final int p1 = 68;

    void display2();
}

interface p2 extends p {
    final int p2 = 69;

    void display3();
}

interface p12 extends p1, p2 {
    final int p12 = 70;

    void display4();
}

public class mainClass {
    public static void main(String arg[]) {
        implimentation i = new implimentation();
        i.display1();
        i.display2();
        i.display3();
        i.display4();
    }
}