package zad2;

public class ShapeDescriber{

    public void describe(ShapeExt shape){
        System.out.println("Pole: " + shape.getArea());
        System.out.println("Obwód: " + shape.getPerimeter());
    }
}
