package lesson5;

public class Main2 {
    public static void main(String[] args) {
        // Есть массив 5 на 5, напечатать только его главную диагональ

        int[][] nums = new int[5][5];
        for (int i = 0; i < nums.length; i++) { // генерируем индекс строк
            for (int j = 0; j < nums[i].length; j++) { // индекс колонок

                if ((i + j) == nums.length -1){// когда мы печатаем ячейку
                    System.out.print(nums[i][j] + " ");

                } else { // печатаем пустые места
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }
    }
}