public class NextGreaterElement {
        public int[] nextGreater(int[] A) {
            int[] B = new int[A.length];
            int idx = 0;
            boolean swapped = false;
            for(int i=0; i<A.length;i++) {
                for (int j=i+1;j<A.length;j++) {
                    if(A[j] > A[i]) {
                        B[idx] = A[j];
                        idx++;
                        swapped = true;

                        break;
                    }
                }
                if(swapped) {
                    swapped = false;
                } else {
                    B[idx] = -1;
                    idx++;
                }
            }
            return B;
        }
}
