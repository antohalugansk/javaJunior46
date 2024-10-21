package lesson8;

import java.util.Scanner;

public class ToursBaza {
    private Tour[] tours = new Tour[100000];

    public void addTour(Tour tour) {
        // null
        // ищем пустую ячейку в массиве, чтобы положить тур
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = tour; // сохранение тура
                break;  // останавливается, что бы не сохранилас во все ячейки


            }

        }
        // Создать метод, который будет печатать на консоль туры в ... страну


    }

    public void searchByCountry() {
        System.out.println("Введите страну в которую хотите поехать: ");
        Scanner scanner = new Scanner(System.in);
      String country = scanner.nextLine().toLowerCase();
        System.out.println("-------Туры в " + country);
        for (Tour t : tours) {
            if (t != null && t.getCountry().equalsIgnoreCase(country))
                t.printTour();

        }
        System.out.println(" ------------");

    }
    public void printToursByBudget(int minBudget, int maxBudget) {
        System.out.println("Туры с бюджетом от " + minBudget + " до " + maxBudget + ":");
        for (Tour t : tours) {
            if (t != null && t.getPrice() >= minBudget && t.getPrice() <= maxBudget) {
                t.printTour();
            }
        }
    }

    public void printToursByTransport(String transport) {
        System.out.println("Туры с транспортом: " + transport);
        for (Tour t : tours) {
            if (t != null && t.getTransport().equalsIgnoreCase(transport)) {
                t.printTour();
            }
        }
    }
    public void printToursByStars(int minStars) {
        System.out.println("Туры с отелями от " + minStars + " звезд и выше:");
        for (Tour t : tours) {
            if (t.getHotel().getStars() >= minStars) {
                t.printTour();
            }
        }
    }

    public void printToursMinPrice(int maxPrice) {
        System.out.println("Туры с ценой ниже " + maxPrice + " рублей:");
        for (Tour t : tours) {
            if (t.getPrice() < maxPrice) {
                t.printTour();
            }
        }
    }
    public void printMostExpensiveTour() {
        Tour mostExpensiveTour = null;

        for (Tour t : tours) {
            if (t != null) { // Проверяем, что тур не равен null
                if (mostExpensiveTour == null || t.getPrice() > mostExpensiveTour.getPrice()) {
                    mostExpensiveTour = t; // Обновляем на самый дорогой тур
                }
            }
        }

        if (mostExpensiveTour != null) {
            System.out.println("Самый дорогой тур:");
            mostExpensiveTour.printTour(); // Печатаем информацию о самом дорогом туре
        } else {
            System.out.println("Нет доступных туров.");
        }
    }
}















