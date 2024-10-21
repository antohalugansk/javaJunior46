package HomeWork7;

public class Treugolnik {
   private double a;
   private double b;
   private double c;

    public Treugolnik() {
    }

    public Treugolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void printPerimetr(){
        System.out.println(2 * (a+b));
    }
    public void square(){
        System.out.println(a * b);
    }
}
