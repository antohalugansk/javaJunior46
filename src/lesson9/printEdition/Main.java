package lesson9.printEdition;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] library = new PrintEdition[6];
        library[0] = new Journal("Natali", 1999, 59, "Moscow", 7);
        library[1] = new Journal("Natali", 2000, 35, "Moscow", 3);
        library[2] = new Journal("Natali", 2020, 69, "Moscow", 4);
        library[3] = new Book("War and Peace", 2001, 1500, "Moscow", "Tolstoy");
        library[4] = new Book("Master and Margarita", 2010, 720, "Moscow", "Bulgakov");

        PrintEdition theFat = library[0];
        for (PrintEdition pe : library) {
            if (pe != null && theFat.getPage() < pe.getPage()) {
                theFat = pe;

            }
            theFat.printInfo();
        }

    }
}
