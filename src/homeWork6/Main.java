package homeWork6;

public class Main {
    public static void main(String[] args) {


        // Есть текст "Я буду учиться лучше и лучше"
        // Напечатать на консоль каждое слово в отдельной строке

        String text = "Я буду учиться лучше и лучше";

        // Разделяем строку по пробелам, чтобы получить слова
        String[] words = text.split(" ");

        // Печатаем каждое слово на новой строке
        for (String word : words) {
            System.out.println(word);
        }
    }
}
