package HomeWork9;

public class MoldovianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 20; // Примерное количество яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Молдова. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


