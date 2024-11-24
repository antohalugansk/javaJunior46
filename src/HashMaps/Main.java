package HashMaps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Создаем объект HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // Добавляем элементы в HashMap
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);

        // Вывод значений по ключам
        System.out.println("Score of Alice: " + scores.get("Alice"));
        System.out.println("Score of Bob: " + scores.get("Bob"));

        // Проверка существования ключа
        if (scores.containsKey("Charlie")) {
            System.out.println("Charlie's score is: " + scores.get("Charlie"));
        }

        // Итерация по HashMap
        System.out.println("\nAll scores:");
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }

        // Удаление элемента
        scores.remove("Alice");
        System.out.println("\nAfter removing Alice:");
        System.out.println(scores);

        // Проверка пустоты
        if (scores.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }
    }
}

