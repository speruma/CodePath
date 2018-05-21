import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int longestConsecutive(final int[] A) {
            Set<Integer> setOfIntegers = new TreeSet<>();
            int sum = 1;
            int count =1;

            for (int i=0; i<A.length;i++) {
                setOfIntegers.add(A[i]);
            }

            for(Integer i: setOfIntegers) {

                if(setOfIntegers.contains(i+1)) {
                    sum +=1;
                } else {
                    count = Math.max(count, sum);
                    sum = 1;
                }

            }

            return count;
        }
}
