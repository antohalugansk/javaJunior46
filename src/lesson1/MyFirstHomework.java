public class MyFirstHomework {
    public static void main(String[] args) {
        int totalMoney = 1000;  // Всего денег
        int snickersPrice = 35; // Цена одного сникерса
        double candyPrice = 3.5; // Цена одной конфеты

        // Считаем, сколько сникерсов можно купить
        int snickersCount = totalMoney / snickersPrice;

        // Считаем оставшиеся деньги после покупки сникерсов
        int remainingMoney = totalMoney - (snickersCount * snickersPrice);

        // Считаем, сколько конфет можно купить на оставшиеся деньги
        int candyCount = (int) (remainingMoney / candyPrice);

        // Считаем остаток сдачи
        double change = remainingMoney - (candyCount * candyPrice);

        // Вывод результатов
        System.out.println("Сникерсов куплено: " + snickersCount);
        System.out.println("Конфет куплено: " + candyCount);
        System.out.println("Остаток сдачи: " + change + " рубля(ей)");
    }
}
