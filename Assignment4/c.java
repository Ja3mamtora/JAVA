public class practical3 {
    public static void main(String[] args) {
    try {
    int a[] = new int[2];
    a[100]=100/0;
    }
    catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException");
    }catch(ArithmeticException e) {
    System.out.println("ArithmeticException");
    }
    finally{
    System.out.println("Inside Finally");
    }
    }
