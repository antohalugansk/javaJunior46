package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Treugolnik treugolnik = new Treugolnik(5, 5, 7);
        treugolnik.printPerimetr();
        treugolnik.square();

        Circle circle = new Circle(25);
        circle.printPerimetr();
        circle.square();

        Oval oval = new Oval(5,8);
        oval.printPerimetr();
        oval.square();


        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.printPerimetr();
        rectangle.square();


    }
}
