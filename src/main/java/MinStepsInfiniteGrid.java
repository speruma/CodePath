public class MinStepsInfiniteGrid {

        public static int coverPoints(int[] A, int[] B) {
            int sum = 0;
            for(int i=0; i<A.length-1;i++) {
                sum += Math.max(Math.abs(A[i]-A[i+1]), Math.abs(B[i] -B[i+1]));
            }
            return sum;

        }
}
