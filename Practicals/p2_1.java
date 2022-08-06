public class Circle{
    private double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(double r)
    {
        radius=r;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
}
public class Check{
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        System.out.println("Perimeter = "+c1.getPerimeter());
        System.out.println("Area = "+c1.getArea());
        Circle c2=new Circle(2.5);
        System.out.println("Perimeter = "+c2.getPerimeter());
        System.out.println("Area = "+c2.getArea());
    }
}
