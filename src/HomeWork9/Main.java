package HomeWork9;

public class Main {
    public static void main(String[] args) {
        Hen russianHen = HenFactory.getHen("Russia");
        if (russianHen != null) {
            System.out.println(russianHen.getDescription());
        } else {
            System.out.println("Ошибка: курица не найдена для указанной страны.");
        }
    }
}



