package homewWork4;

public class Main2 {
    public static void main(String[] args) {
        int[] masiv = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        // Цикл для обхода массива с конца
        for (int i = masiv.length - 1; i >= 0; i--) {
            // Проверка на чётность числа
            if (masiv[i] % 2 == 0) {
                System.out.println(masiv[i]);
            }
        }
    }
}

