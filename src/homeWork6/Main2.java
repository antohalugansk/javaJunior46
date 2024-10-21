package homeWork6;public class Main2 {
    public static void main(String[] args) {
        // Напечатать на консоль кол-во гласных букв в тексте

        String text = "Я буду учиться лучше и лучше";

        // Массив гласных букв (включая строчные и заглавные)
        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};

        int vowelCount = 0;

        // Проходим по каждому символу текста
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Проверяем, является ли текущий символ гласной
            for (char vowel : vowels) {
                if (currentChar == vowel) {
                    vowelCount++;
                    break; // Как только нашли гласную, выходим из внутреннего цикла
                }
            }
        }

        // Выводим количество гласных букв
        System.out.println("Количество гласных букв: " + vowelCount);
    }
}


