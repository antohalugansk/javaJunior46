package HomeWork7;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printPerimetr(){
        System.out.println(2 * Math.PI * radius);
    }

    public void square(){
        System.out.println(Math.PI * radius * radius);
    }
}
