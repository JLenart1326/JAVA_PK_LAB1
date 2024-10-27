package zad2;

public class Rectangle extends ShapeExt {
    // Pola (właściwości klasy)
    float a;
    float b;

    // Konstruktor (służy do tworzenia obiektów klasy)
    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public Rectangle() {
        this.a = 0;
        this.b = 0;
    }

    // Metoda (czynność, którą klasa może wykonać)
    @Override
    public float getArea(){
        return a*b;
    };
    @Override
    public float getPerimeter(){
        return 2*a+2*b;
    };
}
