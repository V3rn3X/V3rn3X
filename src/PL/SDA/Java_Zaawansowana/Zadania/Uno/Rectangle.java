package src.PL.SDA.Java_Zaawansowana.Zadania.Uno;

class Rectangle implements Shape {

    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("The area of the rectangle with the side " + a + " and " + b + " to: " + (a * b));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of the rectangle with side " + a + " oraz " + b + " to: " + (a + a + b + b));
    }
}
