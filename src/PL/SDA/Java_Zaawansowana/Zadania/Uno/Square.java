package src.PL.SDA.Java_Zaawansowana.Zadania.Uno;

class Square implements Shape {

    int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public void getArea() {
        System.out.println("The area of the square with the side " + x + " to: " + (x * x));

    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of the rectangle with side " + x + " to: " + (4 * x));
    }
}
