package lesson5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main4 {
    private static int i;
    private static int j;

    public static void main(String[] args) {
        System.out.println("Выберите уровень игры:");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Особый");
        System.out.println("4 - Профессионал");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        switch (level) {
            case 1: // Когда выбрали новичка
                int[][] fieldNovice = new int[9][9];
                for (int mine = 0; mine < 10; mine++) {
                    i = ThreadLocalRandom.current().nextInt(0, 9);
                    j = ThreadLocalRandom.current().nextInt(0, 9);
                    if (fieldNovice[i][j] == -1) {
                        mine--; // если мина уже стоит, повторить установку
                    } else {
                        fieldNovice[i][j] = -1; // устанавливаем мину
                    }
                }

                // выводим поле на консоль
                for (int i = 0; i < fieldNovice.length; i++) {
                    for (int j = 0; j < fieldNovice[i].length; j++) {
                        System.out.print(fieldNovice[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2: // Когда выбрали любителя
                int[][] fieldAmateur = new int[16][16];
                for (int mine = 0; mine < 40; mine++) {
                    i = ThreadLocalRandom.current().nextInt(0, 16);
                    j = ThreadLocalRandom.current().nextInt(0, 16);
                    if (fieldAmateur[i][j] == -1) {
                        mine--; // если мина уже стоит, повторить установку
                    } else {
                        fieldAmateur[i][j] = -1; // устанавливаем мину
                    }
                }

                // выводим поле на консоль
                for (int i = 0; i < fieldAmateur.length; i++) {
                    for (int j = 0; j < fieldAmateur[i].length; j++) {
                        System.out.print(fieldAmateur[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3: // Когда выбрали особый уровень
                int[][] fieldSpecial = new int[16][30];
                for (int mine = 0; mine < 99; mine++) {
                    i = ThreadLocalRandom.current().nextInt(0, 16);
                    j = ThreadLocalRandom.current().nextInt(0, 30);
                    if (fieldSpecial[i][j] == -1) {
                        mine--; // если мина уже стоит, повторить установку
                    } else {
                        fieldSpecial[i][j] = -1; // устанавливаем мину
                    }
                }

                // выводим поле на консоль
                for (int i = 0; i < fieldSpecial.length; i++) {
                    for (int j = 0; j < fieldSpecial[i].length; j++) {
                        System.out.print(fieldSpecial[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 4: // Когда выбрали профессионала
                System.out.println("Введите ширину:");
                int width = scanner.nextInt();
                System.out.println("Введите высоту:");
                int height = scanner.nextInt();
                System.out.println("Введите количество мин:");
                int mines = scanner.nextInt();

                int[][] fieldProfessional = new int[height][width];
                for (int mine = 0; mine < mines; mine++) {
                    i = ThreadLocalRandom.current().nextInt(0, height);
                    j = ThreadLocalRandom.current().nextInt(0, width);
                    if (fieldProfessional[i][j] == -1) {
                        mine--; // если мина уже стоит, повторить установку
                    } else {
                        fieldProfessional[i][j] = -1; // устанавливаем мину
                    }
                }

                // выводим поле на консоль
                for (int i = 0; i < fieldProfessional.length; i++) {
                    for (int j = 0; j < fieldProfessional[i].length; j++) {
                        System.out.print(fieldProfessional[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Некорректный уровень игры.");
                break;
        }
    }
}
