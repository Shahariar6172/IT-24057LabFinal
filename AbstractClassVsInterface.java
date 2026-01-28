abstract class Shape {
String color;
public Shape(String color) {
this.color = color;
    }
public abstract double area();
}
interface Drawable {
    void draw();
}
class Circle extends Shape implements Drawable {
private double radius;
public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
    }
    @Override
public double area() {
    return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with area: " + area());
    }
}
class Rectangle extends Shape implements Drawable {
    private double length, width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle with area: " + area());
    }
}
public class AbstractClassVsInterface {
public static void main(String[] args) {
    Shape s1 = new Circle("Red", 5.0);
    Shape s2 = new Rectangle("Blue", 4.0, 6.0);
    Drawable d1 = (Drawable) s1;
    Drawable d2 = (Drawable) s2;
    d1.draw();
    d2.draw();
    }
}
