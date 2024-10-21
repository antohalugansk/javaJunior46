package homeWork6;public class Main3 {
    public static void main(String[] args) {

        // Заменить в тексте все гласные на БОЛЬШИЕ ГЛАСНЫЕ и напечатать итоговый текст на консоль

        String text = "Я буду учиться лучше и лучше";

        // Массив гласных букв (включая строчные и заглавные)
        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я',
                'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};

        // Создаем пустую строку для накопления результата
        String modifiedText = "";

        // Проходим по каждому символу текста
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Проверяем, является ли текущий символ гласной
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (Character.toLowerCase(currentChar) == vowel || Character.toUpperCase(currentChar) == vowel) {
                    modifiedText += Character.toUpperCase(currentChar); // Преобразуем в заглавную
                    isVowel = true;
                    break;
                }
            }

            // Если символ не гласный, добавляем его без изменений
            if (!isVowel) {
                modifiedText += currentChar;
            }
        }

        // Печатаем итоговый текст
        System.out.println(modifiedText);
    }
}

