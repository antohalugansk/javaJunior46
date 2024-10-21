package lesson6;

public class Main1 {
    public static void main(String[] args) {
        // есть текст (задаем сами)
        // напечатать на консоль через символ

        String text = "я учусь на разработчика java";
       char[] simvols =  text.toCharArray();
       for (int i = 0; i < simvols.length; i = i +2){
           System.out.println(simvols[i]);

       }

    }
}
