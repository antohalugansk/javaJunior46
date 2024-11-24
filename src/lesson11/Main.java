package lesson11;

import java.util.ArrayList; // Импортируем ArrayList
import java.util.List; // Импортируем List

public class Main {
    public static void main(String[] args) {

        String[] wordsArray = new String[3];
        wordsArray[0] = "Hello";
        wordsArray[1] = "World";
        wordsArray[2] = "Java";
        System.out.println(wordsArray[1]);  // Выводит "World"

        List<String> wordsList = new ArrayList<>();  // Используем List
        wordsList.add("hello");
        wordsList.add("world");
        wordsList.add("java");
        System.out.println(wordsList.get(1));  // Выводит "world"
    }
}
