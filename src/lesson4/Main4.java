package lesson4;

public class Main4 {
    public static void main(String[] args) {

       // Задача по обьеденению 2     b  массива
       char[] abcd = {'a', 'b', 'c', 'd'};
       char[] qwer = {'q','w','e','r'};

       char[] abcdqwer = new char[abcd.length + qwer.length];

        abcdqwer[0] = abcd[0]; // переложили a
        abcdqwer[1] = abcd[1];  // b
        abcdqwer[2] = abcd[2];
        abcdqwer[3] = abcd[3];

        abcdqwer[4] = qwer[0];// второй массив
        abcdqwer[5] = qwer[1];
        abcdqwer[6] = qwer[2];
        abcdqwer[7] = qwer[3];

        for (int i =0; i < abcdqwer.length; i++){
            if (i< abcd.length){ abcdqwer[i] = abcd[i]; // с первого массива

            }else // второй массив
                abcdqwer[i] = qwer[i - abcd.length];
            System.out.println(abcdqwer[i]);


        }

    }
}
