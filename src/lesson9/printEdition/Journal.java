package lesson9.printEdition;

public class Journal extends PrintEdition{

    private int numberOfYear;

    public Journal() {
    }

    @Override
    public void printInfo() {
        System.out.println("Journal " + getNazvanie() + "кол- во страниц: " + getPage());
    }

    public Journal(String nazvanie, int year, int page, String izdatelstvo, int numberOfYear) {
        super(nazvanie, year, page, izdatelstvo);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

}
