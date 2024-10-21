package lesson2;

public class Main6 {
    public static void main(String[] args) {

        //  у нас 100.000
        // сколько денег мы снимим с депозита,если положим деньги на 7 лет под 17%
        // капитализация ежемесячная

        double money = 100000;
        int year = 5;
        int procent  = 17;

        // 7 * 12
        for ( int month = 0; month < 12 * year; month++){
            money = money + ((money/100 )* procent)/12;

        }
        System.out.println(money);

    }
}
