package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        // Программа, которая будет у пользователя спрашивать какую фигуру
        //  мы хотим посчитать (овал, квадрат, треугольник, круг)
        // Программа запросит у нас ввести все необходимые данные по фигуре и выведет площадь и периметр
        System.out.println("Выберите фигуру");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Овал");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Прямоугольник");
        System.out.println("5 - Круг");

        // Scanner - тип, описывает "считыватель" информации с источника
        // Формула создания любого обьекта ( Все то что не примитивный тип)


        Scanner scanner = new Scanner(System.in);

        int selectfigura =  scanner.nextInt();

        // управляющая крнструкция ( if  switch )

        switch (selectfigura){
            case 1: // ТРЕУГОЛЬНИК

                System.out.println("Введите сторону A");
                int a = scanner.nextInt();

                System.out.println("Введите сторону Б");
                int b = scanner.nextInt();

                System.out.println("Введите сторону С");
                int c = scanner.nextInt();
                System.out.println("Периметр треугольника: " + (a + b + c));


             // Площадь треугольника

             // Ввод сторон треугольника

                        System.out.println("Введите сторону A:");
                        int p1 = scanner.nextInt();

                        System.out.println("Введите сторону Б:");
                        int p2 = scanner.nextInt();

                        System.out.println("Введите сторону С:");
                        int p3 = scanner.nextInt();

                        // Вычисление площади напрямую по формуле Герона
                        double area = Math.sqrt(((p1 + p2 + p3) / 2.0) * (((p1 + p2 + p3) / 2.0) - p1) * (((p1 + p2 + p3) / 2.0) - p2) * (((p1 + p2 + p3) / 2.0) - p3));

                        // Вывод площади
                        System.out.println("Площадь треугольника: " + area);
                break;





            case 2: // Овал
                System.out.println("Введите малый радиус: ");
                int r1 = scanner.nextInt();
                System.out.println("Введите большой радиус: ");
                int r2  = scanner.nextInt();
                double p = 2 * Math.PI * Math.sqrt(((r1 * r1) + (r2 * r2))/ 2);
                System.out.println(" Периметр овала: " + p);

                // Площадь овала
                // Ввод радиусов овала
                System.out.println("Введите малый радиус (r1):");
                        double q1 = scanner.nextDouble();

                        System.out.println("Введите большой радиус (r2):");
                        double q2 = scanner.nextDouble();

                        // Вычисление площади овала
                        double oval = Math.PI * q1 * q2;

                        // Вывод площади
                        System.out.println("Площадь овала: " + oval);
                        break;


            case 3:

                // Ввод стороны квадрата

                System.out.println("Введите сторону квадрата А: ");

                double side = scanner.nextDouble();

                // Вычисление площади квадрата
                double qa = side * side;
                System.out.println("Площадь квадрата " + qa);

                // Вычисление периметра квадрата
                System.out.println();

                double perimeter = 4 * side;
                System.out.println("Площадь квадрата: " + perimeter);

                // Вывод площади квадрата
                System.out.println("Периметр квадрата: " + perimeter);
                break;

            case 4:

                // Периметр прямругольника

                    System.out.println("Введите сторону прямоугольника A: ");
                    double prside1 = scanner.nextDouble();
                    System.out.println("Введите сторону прямоугольника Б: ");
                    double prside2 = scanner.nextDouble();
                    System.out.println("Периметр прямоугольника: " + (2 * (prside1 + prside2))); // Исправлена скобка

                    // Площадь прямоугольника
                    // Повторно используем введённые значения prside1 и prside2
                    System.out.println("Площадь прямоугольника: " + (prside1 * prside2)); // Здесь используем те же переменные
                break;

            // Круг
            // Радиус круга
            case 5:
                System.out.println("Введите радиус круга");

                double radius = scanner.nextDouble();

                // Вычисление периметра (длины окружности)
                double perKruga = 2 * Math.PI * radius;
                System.out.println("Периметр круга: " + perKruga);

                // Вычисление площади круга
                double areaKruga = Math.PI * radius * radius;
                System.out.println("Площадь круга: " + areaKruga);
                }
            }











        }
















