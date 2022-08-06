class Adding {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

class Overloading {
    public static void main(String[] args) {
        System.out.println(Adding.add(67, 67));
        System.out.println(Adding.add(32.4, 12.6));
    }
}
