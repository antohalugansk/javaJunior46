package lesson5;

public class Main {
    public static void main(String[] args) {
        //Создаем 2х мерный массив, заполненный 0
        // Задача: Напечатать этот массив

        int [] [] nums = new int[5][5];

        for (int i = 0; i < nums.length; i++){ // генерируем цикл строки
            // печатаем одну строку
           // System.out.print(nums[i][0] + " ");
          //  System.out.print(nums[i][1] + " ");
          //  System.out.print(nums[i][2] + " ");
           // System.out.print(nums[i][3] + " ");
          //  System.out.print(nums[i][4] + " ");
          //  System.out.println();

            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();





        }


    }
}