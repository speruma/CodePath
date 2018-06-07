import java.util.ArrayList;

public class SortedInsertPos {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int left = 0;
        int right = a.size() - 1;

        while(left <= right) {
            int mid = left+(right - left)/2;
            if(a.get(mid).intValue() == b) {
                return mid;
            } else if (b < a.get(mid)) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
