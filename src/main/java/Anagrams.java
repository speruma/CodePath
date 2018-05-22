import java.util.*;

public class Anagrams {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    public static int[][] anagrams(final String[] A) {
        Map<String, List<String>> newMap = new TreeMap<String, List<String>>();
        for (int i=0; i<A.length; i++) {
            char[] chars = A[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            ArrayList<String> val = (ArrayList) newMap.get(s);
            if(val != null && val.size() != 0) {
                val.add(String.valueOf(i));
                newMap.put(s, val);
            } else {
                List<String> list = new ArrayList<>();
                list.add(String.valueOf(i));
                newMap.put(s, list);
            }
        }
        int size = newMap.size();

        int[][] intArray = new int[size][];
        int i =0;
        for(String s: newMap.keySet()) {
            List<String> values = newMap.get(s);
            int valuessize = values.size();
            int[] ints = new int[valuessize];
            int j=0;
            for(String val: values) {
                ints[j] = Integer.parseInt(val);
                j++;
            }
            intArray[i] = ints;
            i++;
        }
        return intArray;
    }
    

}
