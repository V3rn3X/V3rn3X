package src.PL.SDA.Java_Zaawansowana.Zadania.Uno;

class Circle implements Shape {

    int r;
    final double PI = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.println("The area of the circle with the radius " + r + " to: " + (PI * r * r));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of the circle with radius " + r + " to: " + (2 * PI * r));
    }
}