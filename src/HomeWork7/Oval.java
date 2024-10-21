package HomeWork7;

public class Oval {
    private double a;
    private double b;

    public Oval(double a, double b) {
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
    public void printPerimetr() {
        System.out.println(Math.PI * ((3 * (a + b)) - Math.sqrt((3 * a + b) * (a + 3 * b))));
    }

    public void square(){
        System.out.println(Math.PI * a * b);
    }
}
