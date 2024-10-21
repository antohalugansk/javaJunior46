package HomeWork9;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30; // Примерное количество яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

