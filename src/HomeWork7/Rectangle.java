package HomeWork7;

public class Rectangle {
    // Прямоугольник

    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void printPerimetr(){
        System.out.println(2 * (a+b));
    }
    public void square(){
        System.out.println(a * b);

    }


}
