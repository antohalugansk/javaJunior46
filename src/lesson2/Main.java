package lesson2;

class Lesson2 {
    public static void main(String[] args) {
        // Есть число, вывести на консольчетное число. (true)
        // Нечетное false

        int number = 123;

        // упроавляющая конструкция ( позволяет выполнить что то одно из вариантов

        if (number % 2 == 0) {
            System.out.println("это четное число");

        }else {// выполнится ,если не выполнится иф
            System.out.println("Не четное число");

        }


    }
}
