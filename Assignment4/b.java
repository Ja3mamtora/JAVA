Throw
class createdException extends Exception {
    public createdException(int t) {
        System.out.println("I dont like the number");
    }
}

public class practical2 {
public static void main(String[] args) {
try {
throw new createdException(1);
}
catch (createdException e) {
}
}
Throws
public class practical2 {
public static void main(String[] args) throws InterruptedException {
for (int i = 0; i < 10; i++) {
Thread.sleep(10000);
System.out.println("Hello world");
}
}
}
