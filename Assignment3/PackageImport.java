package Mypack;

public class Demo {
    public void method(){
    System.out.println("Method from class Demo from Mypack package");
    }
    }

import Mypack.Demo;

public class PackageImport {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method();
    }
}
