package homeWork6;
    public class Main1 {
        public static void main(String[] args) {

            // Напечатать на консоль предложение полностью наоборот

            String text = "Я буду учиться лучше и лучше";

            // Создаем пустую строку для хранения перевёрнутого текста
            String reversedText = "";

            // Проходим по строке с конца к началу и добавляем символы к результату
            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }

            // Печатаем перевёрнутую строку
            System.out.println(reversedText);
        }
    }

