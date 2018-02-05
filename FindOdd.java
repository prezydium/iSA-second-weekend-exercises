public class FindOdd {

    public int findIt(int[] A) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < A.length; i++) {
            x = A[i];

            y = 0;
            for (int j = 0; j < A.length; j++) {

                if (A[i] == A[j]) {
                    y++;
                }

            } if(!(y%2==0)){
                break;
            }
        }

        int odd = x;
        return odd;
    }
}
