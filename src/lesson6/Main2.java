package lesson6;

public class Main2 {
    public static void main(String[] args) {
        // От пользователя приходи пароль
        // 1 - длина, должнп быть более 8 симвлов
        // 2 - дожна быть одна большая буква
        // 3 - должна быть одна цифра

        String password = " sdfrrv3Ser";
        if (password.length() < 8){
            System.out.println("Парольменьше 8 символов!!!");
            return;
        }
        if (!password.contains("0") && !password.contains("1") && !password.contains("2") && !password.contains("3") &&!password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8") && !password.contains("9")  ){
            System.out.println("Пароль не содержит цифру!!!");
            return;


        }

        String alfabet = "abcdefghijklmnopqrstuvwxyzабвгдежзийклмнопрстуфхцчшщъыьэюя";
        String alfabetUpper = alfabet.toUpperCase();

        int countUpper = 0;
        // генерируем тндексы букв внутри пароля
        for (int i = 0; i < password.length(); i++){
            // берем один символ из пароля
            char ch = password.charAt(i);
            if (alfabetUpper.contains(ch + "")){ // проверяем содержание Большой буквы
                countUpper++;

            }

        }
        if (countUpper ==0){
            System.out.println(" Пароль не содержит большую букву!!!");
        }else System.out.println("УРА!!! Пароль подходит!");



   }
}
