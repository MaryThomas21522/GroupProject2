package GroupProject2;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea(){
        double areaCircle = Math.PI * radius * radius;
        System.out.println("Area of a circle: "+areaCircle);
    }
    @Override
    public void calculatePerimeter(){
        double perimeterCircle = (Math.PI * 2) * radius;
        System.out.println("Perimeter of a circle: "+perimeterCircle);
    }
}

class Square implements Shape {
    private double side;

    public Square(double side){
        this.side=side;
    }

    @Override
    public void calculateArea(){
        double areaSquare = side * side;
        System.out.println("Area of a square: "+areaSquare);
    }
    @Override
    public void calculatePerimeter(){
        double perimeterSquare = side * 4;
        System.out.println("Perimeter of a square: "+perimeterSquare);
    }
}

class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Circle(9.5);
        shape.calculateArea();
        shape.calculatePerimeter();
        Shape shape1 = new Square(2.5);
        shape1.calculateArea();
        shape1.calculatePerimeter();
    }
}

/*
Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
 */