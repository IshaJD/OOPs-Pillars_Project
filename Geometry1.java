import java.util.Scanner;

public class Geometry1 {
    public static void main(String[] args) {

        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry2 g = new Geometry2();
        g.permit(s);
        g.permit(r);
        g.permit(c);

    }
}

class Geometry2 {
    public void permit(Shape ref) {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

// shape parent class
abstract class Shape {
    float area;

    abstract public void compute();

    abstract public void acceptInput();

    public void disp() {
        System.out.println("THE AREA  IS : " + area);
    }
}

// rectangle class
class Rectangle extends Shape {

    private float length;
    private float breadth;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF RECTANGLE : ");
        length = sc.nextFloat();
        System.out.println("ENTER THE BREADTH OF RECTANGLE : ");
        breadth = sc.nextFloat();

    }

    public void compute() {
        area = length * breadth;
    }

}

// square class
class Square extends Shape {
    private float length;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF SQUARE : ");
        length = sc.nextFloat();

    }

    public void compute() {
        area = length * length;
    }

}
// circle class

class Circle extends Shape {
    private float radius;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF CIRCLE : ");
        radius = sc.nextFloat();

    }

    public void compute() {
        area = 3.14f * radius * radius;
    }

}
