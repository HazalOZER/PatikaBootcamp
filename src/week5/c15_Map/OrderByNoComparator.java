package week5.c15_Map;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class OrderByNoComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
