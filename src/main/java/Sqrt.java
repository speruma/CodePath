public class Sqrt {
    public int sqrt(int a) {
        long left = 1;
        long right = a;

        while(left <= right) {

            long mid = left + (right - left)/2;

            if(mid * mid == a) {
                return (int) mid;
            } else if(a < mid*mid) {
                right = mid -1;
            } else {
                left = mid +1;
            }
        }

        return (int) right;

    }
}
