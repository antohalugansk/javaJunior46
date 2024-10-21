package HomeWork9;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 25; // Примерное количество яиц в месяц
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

