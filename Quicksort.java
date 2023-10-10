import java.util.*;

public class Quicksort {
    public static void quickSort(ArrayList<String> list) {
        quickSort(list, 0, list.size() - 1);
    }

    public static void quickSort(ArrayList<String> list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(ArrayList<String> list, int first, int last) {
        String pivot = list.get(first); 
        int low = first + 1; 
        int high = last; 

        while (high > low) {
            while (low <= high && list.get(low).compareTo(pivot) <= 0)
                low++;

            while (low <= high && list.get(high).compareTo(pivot) > 0)
                high--;

            if (high > low) {
                String temp = list.get(high);
                list.set(high, list.get(low));
                list.set(low, temp);
            }
        }

        while (high > first && list.get(high).compareTo(pivot) >= 0)
            high--;

        if (pivot.compareTo(list.get(high)) > 0) {
            list.set(first, list.get(high));
            list.set(high, pivot);
            return high;
        } else {
            return first;
        }
    }
}
