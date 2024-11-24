package lesson12;

import java.util.Set;
import java.util.TreeSet;

public abstract class ComparatorTest {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Serebro", 2.5);
        Coin coin2 = new Coin(50, 1999, "Gold", 2.5);
        Coin coin3 = new Coin(40, 2099, "Serebro", 3.5);
        Coin coin4 = new Coin(450, 2000, "Gold", 4.5);
        Coin coin5 = new Coin(50, 2012, "Platinum", 5.0);
        Coin coin6 = new Coin(4, 20109, "Serebro", 2.5);

        Set<Coin> coinsSet = new TreeSet<>(new SortByDiameterComparator());
        coinsSet.add(coin1);
        coinsSet.add(coin2);
        coinsSet.add(coin3);
        coinsSet.add(coin4);
        coinsSet.add(coin5);
        coinsSet.add(coin6);

        System.out.println("Sorted by diameter:");
        for (Coin coin : coinsSet) {
            System.out.println(coin);
        }

        Set<Coin> coinsSet2 = new TreeSet<>((o1, o2) -> o1.getYear() - o2.getYear());
        coinsSet2.add(coin1);
        coinsSet2.add(coin2);
        coinsSet2.add(coin3);
        coinsSet2.add(coin4);
        coinsSet2.add(coin5);
        coinsSet2.add(coin6);

        System.out.println("\nSorted by year:");
        for (Coin coin : coinsSet2) {
            System.out.println(coin);
        }
    }
}
