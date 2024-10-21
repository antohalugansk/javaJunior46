package lesson9.printEdition;

public class Book extends PrintEdition {

    private String avtor;

    public Book() {
    }

    public Book(String nazvanie, int year, int page, String izdatelstvo, String avtor) {
        super(nazvanie, year, page, izdatelstvo);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    @Override
    public void printInfo() {
        System.out.println("Книга " + getNazvanie() + "кол- во страниц: " + getPage());
    }

}
