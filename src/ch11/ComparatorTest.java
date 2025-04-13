package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr, new Descending());
        for (String s : strArr) {
            System.out.println("s = " + s);
        }
    }


}
class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}
