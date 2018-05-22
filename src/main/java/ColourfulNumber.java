import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ColourfulNumber {

    public static void main(String[] args) {
        System.out.println("colorful(23) = " + colorful(12));
    }
        public static int colorful(int A) {

            char[] s = String.valueOf(A).toCharArray();
            Set<Integer> newSet = new HashSet<>();

            for(int i=1; i<=s.length;i ++) {
                int div = (int) Math.pow(10,i);
                int remainder = A % div;
                int quotient = A/div;
                if(! newSet.add(getProduct(remainder))) {
                    return 0;
                }

                if(! newSet.add(getProduct(quotient))) {
                    return 0;
                }

                if(i != s.length -1 && i != s.length) {
                    if(! newSet.add(getProduct(Integer.parseInt(s[i]+ "")))) {
                        return 0;
                    }
                }
            }
            return 1;
        }

        public static Integer getProduct(int i) {
            char[] chars = String.valueOf(i).toCharArray();
            Arrays.sort(chars);
            String.valueOf(chars);
            int product = 1;
            for(int j = 0; j < chars.length; j++) {
                product = product * Integer.parseInt(chars[j] + "");
            }
            return Integer.valueOf(product);
        }
}
