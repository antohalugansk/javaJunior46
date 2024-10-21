package homewWork4;

public class Main3 {
    public static void main(String[] args) {
        int[] masiv = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};

        // Цикл для обхода всего массива
        for (int i = 0; i < masiv.length; i++) {
            // Проверка: если число больше 10, выводим его, иначе выводим "__"
            if (masiv[i] > 10) {
                System.out.println(masiv[i]);
            } else {
                System.out.println("__");
            }
        }
    }
}
