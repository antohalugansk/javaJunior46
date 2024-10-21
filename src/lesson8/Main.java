package lesson8;

public class Main {
    public static void main(String[] args) {
        Hotel hotelItaly1 = new Hotel("Венеция отель", 4, "Завтраки");
        Hotel hotelItaly2 = new Hotel("Рим отель", 4, "Пансион");
        Hotel hotelItaly3 = new Hotel("Портофино отель", 5, "Полупаансион");
        Hotel hotelFrance1 = new Hotel("Анси отель", 4, "Пансион");
        Hotel hotelFrance2 = new Hotel("Париж", 5, "Все включено");
        Hotel hotelFrance3 = new Hotel("Леон отель", 4, "Завтраки");
        Hotel hotelOAE1 = new Hotel("Дубай отель", 4, "Завтраки");
        Hotel hotelOAE2 = new Hotel("Абу Дабиотель", 5, "Пансион");
        Hotel hotelOAE3 = new Hotel("Аджман отель", 4, "Полупансион");
        Hotel hotelFinlandiya = new Hotel("Хельсинки", 5, "Пансион");

        Tour france1 = new Tour("Франция", 6, "Самолет", 350000, hotelFrance1);
        Tour france2 = new Tour("Франция", 10, "Самолет", 550000, hotelFrance1);
        Tour france3 = new Tour("Франция", 9, "Самолет", 350000, hotelFrance1);
        Tour Italy1 = new Tour("Италия", 5, "Паром", 450000, hotelFrance1);
        Tour Italy2 = new Tour("Италия", 8, "Самолет", 550000, hotelFrance1);
        Tour Italy3 = new Tour("Италия", 11, "Паром", 250000, hotelFrance1);
        Tour OAE1 = new Tour("ОАЭ", 13, "Самолет", 600000, hotelFrance1);
        Tour OAE2 = new Tour("ОАЭ", 14, "Самолет", 250000, hotelFrance1);
        Tour OAE3 = new Tour("ОАЭ", 4, "Самолет", 550000, hotelFrance1);
        Tour Finlandiya = new Tour("Финляндия", 8, "Автобус", 450000, hotelFrance1);

        ToursBaza baza = new ToursBaza();
        baza.addTour(france1);
        baza.addTour(france2);
        baza.addTour(france3);
        baza.addTour(Italy1 );
        baza.addTour(Italy2);
        baza.addTour(Italy3);
        baza.addTour(OAE1);
        baza.addTour(OAE3);
        baza.addTour(OAE2);
        baza.addTour(Finlandiya);

        baza.searchByCountry();
        baza.printToursByBudget(200000, 400000);
        baza.printToursByTransport("Самолет");
        baza.printToursByStars(4);
        baza.printToursMinPrice(500000);
        baza.printMostExpensiveTour();









    }

}