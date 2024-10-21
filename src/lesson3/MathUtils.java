package lesson3;

public class MathUtils {

    /**
     * Задача создать метод,который будет считать периметр треугольника по трем сторонам и печатать на консоль результат
     * 1 - модифтикатор доступа ( один из 4х слов) данное слово определяет оюласть видимости метода
     * public - доступен всем внутри проекта
     * protected - область видимости внутри пакета и дочерним классом
     * -------  - пакетный ( видимость внутри текущего пакета)
     * private - видимость внутри текущего класса
     * <p>
     * 2 - static ( или указывается или нет)
     * Если метод со словом статик - то этот метод вызывается у названия класса
     * <p>
     * 3 - возвращаемый тип (или слово void если такого нет)
     * 4 - название метода
     * 5 - входящие параметры в () через запятую ТИП НАЗВАНИЕ
     * 6 - тело выполнения метода
     */


    public static void printPerimetrTriangle(int a, int b, int c) {
        System.out.println(a + b + c);

    }


    // Создать метод который будет печатать на консоль только четные из того интервала цифр
// который мы укажем в вде входящих параметров
    public static void printMultiplesByinterval(int numberFrom, int numberTo, int kratnost) {
// 40 - numberFrom
        //60 - numberTo
        // 3 - kratnost
        // напечатать на консоль от 40 до 60 кратны 3
        for (int i = numberFrom; i < numberTo; i ++ ){
            if (i % kratnost == 0){
                System.out.println(i);
            }

        }

    }


    }



