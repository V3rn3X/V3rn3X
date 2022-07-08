package src.PL.SDA.Java_Zaawansowana.Zadania.OOP_Third;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public void move() {
                System.out.println("I am swimming");
            }
        };

        dog.move();
        Animal tiger = new Tiger(4);
        tiger.move();
        Animal duck = new Duck("red");
        duck.move();
    }
}

class Tiger implements Animal {

    int legs;

    public Tiger(int legs) {
        this.legs = legs;
    }

    @Override
    public void move() {
        System.out.println("I am running on " + legs + " legs");
    }
}

class Duck implements Animal {

    String color;

    public Duck(String color){
        this.color = color;
    }

    public void move(){
        System.out.println("I am a flying " + color + " duck");
    }
}