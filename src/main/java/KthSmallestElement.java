import java.util.Map;
import java.util.TreeMap;

public class KthSmallestElement {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int kthsmallest(final int[] A, int B) {
            Map<Integer, Integer> arrayMap = new TreeMap<>();
            int smallestElement = 0;
            int count = 0;
            int sum =0;
            for(int i=0; i< A.length;i++) {
                if(arrayMap.get(A[i]) == null) {
                    arrayMap.put(A[i], 1);
                } else {
                    count = arrayMap.get(A[i]) + 1;
                    arrayMap.put(A[i], count);
                }
            }

            for(Map.Entry<Integer,Integer> entry: arrayMap.entrySet()) {
                if (sum < B) {
                    sum += entry.getValue();
                    smallestElement = entry.getKey();
                } else {
                    break;
                }
            }
            return smallestElement;

        }
}
