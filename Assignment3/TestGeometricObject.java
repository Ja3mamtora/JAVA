import java.util.Date;

public abstract class GeometricObject {
    String color;
    boolean filled;
    Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", dateCreated="
                + dateCreated + ", filled=" + filled + "]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

public class Circle extends GeometricObject {
    double radius;

    public Circle(double radius, boolean filled, String color) {
        super(color,
                filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getArea() {
        return 22 * radius * radius / 7;
    }

    public double getPerimeter() {
        return 2 * 22 * radius / 7;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Rectangle extends GeometricObject {
    double height;
    double width;

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public Rectangle(String color, boolean filled, double height,
            double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

public class TestGeometricObject {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Yellow", true, 10, 10);
        Circle cir = new Circle();
        cir.setColor("red");
        cir.setFilled(true);
        cir.setRadius(10);
        System.out.println("Rectangle ");
        System.out.println("Area = " + rec.getArea());
        System.out.println("Perimeter = " + rec.getPerimeter());
        System.out.println(rec);
        System.out.println();
        System.out.println("Circle ");
        System.out.println("Area = " + cir.getArea());
        System.out.println("Perimeter = " + cir.getPerimeter());
        System.out.println(cir);
    }
}
