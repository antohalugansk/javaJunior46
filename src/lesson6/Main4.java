package lesson6;

public class Main4 {
    public static void main(String[] args) {
        // у нас есть мейл и нужно проверить
        // одна собачка, тольеко одна
        // не должен начинатся или заканчиватся на точку
        // часть после собачки должна содержатся точка

       String email = "alex.qwerty@gmail.com" ;
       // contains - проверка содержания
        // split - разрезать текст по ...---результат string
      String[] partsOfemail =  email.split("@");
      if (partsOfemail.length !=2){
          System.out.println("В мейле нет собачек или их больше чем 2");
          return;
      }
       if (email.endsWith(".") || email.startsWith(".")){
           System.out.println("Не может начинатся или заканчиватся на точку");
           return;

       }
       if (!partsOfemail[1].contains(".")){
           System.out.println("Часть не содержит точку!!!");

       }else {
           System.out.println("Пароль подходит");
       }

    }


}
