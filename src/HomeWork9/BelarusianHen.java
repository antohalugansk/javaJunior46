package HomeWork9;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 22; // Примерное количество яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

