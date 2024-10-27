package mainapp;
import zad1.Shape;
import zad2.Rectangle;
import zad2.Triangle;
import zad2.ShapeDescriber;

public class Main {
    public static void main(String[] args)
    {
        //Zad2
        Shape newShape = new Shape();
        newShape.print();

        //Zad3
        Rectangle rect = new Rectangle(4, 6);
        Triangle triangle = new Triangle(6, 6, 6);

        ShapeDescriber describer = new ShapeDescriber();
        describer.describe(rect);
        describer.describe(triangle);
    }
}