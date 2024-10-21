package lesson2;

public class Main3 {
    public static void main(String[] args) {
        // Есть некая оценка от ученика
        // напечатать на консоль наш ответ как роди\ теля

        int mark = 6;
        switch (mark){
            case 1:
                System.out.println("Плохо иди учись");
                break;
            case 2:
                System.out.println("Ничего страшного, в следующий раз");
                break;

            case 3:
                System.out.println("ok");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Это что за оценка?");
        }
    }
}
