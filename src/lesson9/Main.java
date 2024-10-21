package lesson9;

public class Main {
    public static void main(String[] args) {
        Cvetok cvetok1 = new Cvetok();
        Cvetok cvetok2 = new Cvetok();
        Derevo derevo1 = new Derevo();
        Derevo derevo2 = new Derevo();

        Rastenie[] sad = new Rastenie[4];
        sad[0] = derevo1;
        sad[1] = cvetok2;
        sad[2] = cvetok1;
        sad[3] = derevo2;

        for (Rastenie r:sad){
            r.printInfo();

        }




    }
}
