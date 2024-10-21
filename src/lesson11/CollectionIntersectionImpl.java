package lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionIntersectionImpl implements CollectionUtils {

    // Вынесенная проверка на null
    private void checkForNull(Collection<Integer> a, Collection<Integer> b) {
        if (a == null || b == null) {
            throw new NullPointerException("Коллекции не могут быть null");
        }
    }

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return List.of();
    }

    // Пересечение двух коллекций с дубликатами
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        checkForNull(a, b);

        List<Integer> result = new ArrayList<>();
        List<Integer> tempB = new ArrayList<>(b); // Временная копия коллекции b

        for (Integer elem : a) {
            if (tempB.contains(elem)) {
                result.add(elem);
                tempB.remove(elem); // Удаляем первый попавшийся экземпляр
            }
        }
        return result;
    }

    // Объединение двух коллекций без дубликатов
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        checkForNull(a, b);

        Set<Integer> result = new HashSet<>(a);
        result.addAll(b); // Объединяем, дубликаты автоматически удаляются
        return result;
    }

    // Пересечение двух коллекций без дубликатов
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        checkForNull(a, b);

        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b); // Оставляем только общие элементы, дубликаты исключаются
        return result;
    }

    // Разность двух коллекций
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        checkForNull(a, b);

        List<Integer> result = new ArrayList<>(a);
        result.removeAll(b); // Удаляем элементы, которые есть в b
        return result;
    }

    // Метод main для тестирования
    public static void main(String[] args) {
        CollectionIntersectionImpl collectionUtils = new CollectionIntersectionImpl();

        // Пример данных
        Collection<Integer> a = List.of(1, 2, 2, 3);
        Collection<Integer> b = List.of(2, 2, 4);

        // Тест пересечения с дубликатами
        Collection<Integer> intersectionWithDuplicates = collectionUtils.intersection(a, b);
        System.out.println("Пересечение с дубликатами: " + intersectionWithDuplicates); // Ожидаемый результат: [2, 2]

        // Тест объединения без дубликатов
        Set<Integer> unionWithoutDuplicates = collectionUtils.unionWithoutDuplicate(a, b);
        System.out.println("Объединение без дубликатов: " + unionWithoutDuplicates); // Ожидаемый результат: [1, 2, 3, 4]
    }
}
