package HomeWork9;

public class HenFactory {
    public static Hen getHen(String country) {
        switch (country) {
            case "Russia":
                return new RussianHen();
            case "Ukraine":
                return new UkrainianHen();
            case "Moldova":
                return new MoldovianHen();
            case "Belarus":
                return new BelarusianHen();
            default:
                return null; // Если страна не найдена
        }
    }
}




