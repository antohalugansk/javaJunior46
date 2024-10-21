package lesson1;

public class Main2 {
    public static void main(String[] args) {
        // Задача: Напечатать на консоль какой вид треугольника по трем сторонам

        int a  = 13;
        int b = 17;
        int c = 12;

        if (a != b && b != c && a != c){
            System.out.println("это равносторонний");

        }else if(a == b && b == c && a == c){
            System.out.println("Это разносторонний");
        }else {
            System.out.println("Это равнобедренный треугольник");
         }

        }
}
