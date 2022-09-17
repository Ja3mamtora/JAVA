interface Iprinter {
    public int x=7;
    void display1();
    default void show1()
    {
    System.out.println("This is default in interface");
    }
    }

interface Iscanner {
    public int y = 7;

    void display2();

    default void show2() {
        System.out.println("This is default in interface");
    }
}

import java.util.Vector;

public class Concrete implements Iprinter, Iscanner {
    public void display1() {
        System.out.println("Display1");
    }

    public void display2() {
        System.out.println("Display2");
    }

    public static void main(String[] args) {
        Vector<Concrete> ob = new Vector<Concrete>(5);
        Concrete c[] = new Concrete[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new Concrete();
        }
        for (int i = 0; i < 5; i++) {
            ob.add(c[i]);
        }
        for (int i = 0; i < 5; i++) {
            ob.elementAt(i).show1();
            ob.elementAt(i).show2();
            ob.elementAt(i).display1();
            ob.elementAt(i).display2();
        }
    }
}
