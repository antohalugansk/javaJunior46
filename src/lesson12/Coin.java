package lesson12;

//import java.util.Objects;
//
//public class Coin implements ComparatorTest {
//    private int nominal;
//    private int year;
//    private String metalName;
//    private double diametr;
//
//    public Coin() {
//    }
//
//    public Coin(int nominal, int year, double diametr, String metalName) {
//        this.nominal = nominal;
//        this.year = year;
//        this.diametr = diametr;
//        this.metalName = metalName;
//    }
//
//    public int getNominal() {
//        return nominal;
//    }
//
//    public void setNominal(int nominal) {
//        this.nominal = nominal;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getMetalName() {
//        return metalName;
//    }
//
//    public void setMetalName(String metalName) {
//        this.metalName = metalName;
//    }
//
//    public double getDiametr() {
//        return diametr;
//    }
//
//    public void setDiametr(double diametr) {
//        this.diametr = diametr;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Coin coin = (Coin) o;
//        return nominal == coin.nominal && year == coin.year && Double.compare(diametr, coin.diametr) == 0 && Objects.equals(metalName, coin.metalName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nominal, year, metalName, diametr);
//    }
//
//    @Override
//    public String toString() {
//        return "Coin{" +
//                "nominal=" + nominal +
//                ", year=" + year +
//                ", metalName='" + metalName + '\'' +
//                ", diametr=" + diametr +
//                '}';
//    }
//
//    //this - текущая монета
////o - с кем сравниваем
//    @Override
//    public int compareTo(Coin o) {
//        //Сначала сортируем по номиналу
//        if (this.nominal != o.nominal) {
//            return this.nominal - o.nominal;
//        }
//        //Потом сортируем по году
//        if (this.year != o.year) {
//            return this.year - o.year;
//        }
//        //Потом сортируем по металлу
//        return this.metalName.compareTo(o.metalName);
//
//    }
//}
