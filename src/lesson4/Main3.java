package lesson4;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
// напишем таймер  с максимальным рабочим временем - 3 года
        // данный таймер должен постоянно печататьна консоль сколько времени прошло от старта

        for (int year = 0; year <3; year ++){ // тело работает 1 год
            for (int month = 0; month <12; month++){ // Тело работает 1 месяц

                for (int day = 0; day <30; day++){ // 1 DAY

                    for (int hour = 0; hour <24; hour++){ // 1hour
                        for (int min = 0;min <60; min++){ //1 minute
                            for (int sec = 0; sec <60; sec++){
                                Thread.sleep (1000);
                                System.out.printf("Со старта прошло : %d года, %d месяца, %d дней, %d часа, %d минут, %d секунды \n", year, month,day, hour,min,sec);

                            }

                        }
                    }



                }

            }

        }
    }
}
