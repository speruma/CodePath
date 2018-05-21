public class PrettyPrint {
    public int[][] prettyPrint(int A) {

        int size=A*2 -1;
        int top=0;
        int left=0;
        int bottom=size-1;
        int right=size-1;
        int dir = 0;
        int[][] output = new int[size][size];
        while(top<=bottom && left <= right) {

            if(dir == 0) {
                for(int i=left;i<=right;i++) {
                    output[top][i] = A;
                }
                top++;
                dir = 1;
            }

            if(dir ==1) {
                for(int i=top; i<=bottom;i++) {
                    output[i][right]=A;
                }
                right --;
                dir = 2;
            }

            if(dir ==2 ) {
                for(int i=right;i>=left;i--){
                    output[bottom][i]=A;
                }
                bottom--;
                dir=3;
            }

            if(dir==3) {
                for(int i=bottom;i>=top;i--){
                    output[i][left]=A;
                }
                left++;
                dir=0;
            }
            A--;

        }
        return output;
    }
}
