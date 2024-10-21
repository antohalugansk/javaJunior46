//package lesson12;
//
//import java.util.Comparator;
//
//public class SortByDiameterComparator implements Comparator<Coin> {
   // @Override
//    public int compare(Coin o1, Coin o2) {
//        //сначала сортируем по диаметру
//     //   if (o1.getDiameter() != o2.getDiameter()) {
//            return Double.compare(o1.getDiameter(), o2.getDiameter());
//        }
//
//        //Потом сортируем по номиналу
//      //  if (o1.getNominal() != o2.getNominal()) {/**/
//            return o2.getNominal() - o1.getNominal();
//        }
//
//        //Потом сортируем по году
//     //   if (o1.getYear() != o2.getYear()) {
//            return o1.getYear() - o2.getYear();
//        }
//
//        //Потом сортируем по металлу
//        return o1.getMetalName().compareTo(o2.getMetalName());
//    }
//}
