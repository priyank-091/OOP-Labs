class Shape {

    public void computeArea() {
        System.out.println("Area of shape.");
    }
}

class Triangle extends Shape {
    private double length;
    private double height;

    public Triangle(double l, double h) {
        length = l;
        height = h;
    }

    // return type should be same.
    @Override
    public void computeArea() {
        double area = 0.5 * length * height;
        System.out.println("The area of triangle is = " + area);
    }
}

class Square extends Shape {
    private double side;

    public Square(double s) {
        side = s;
    }

    @Override
    public void computeArea() {
        double area = side * side;
        System.out.println("The area of square is = " + area);
    }
}

public class exercise {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.computeArea();
        Shape shape2 = new Triangle(5, 10);
        shape2.computeArea();
        Shape shape3 = new Square(10);
        shape3.computeArea();
        // Square square1 = new Shape();error.
        // square1.computeArea();
    }

}
