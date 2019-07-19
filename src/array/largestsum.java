package array;

public class largestsum {
    public int maxSubArray(int[] A) {
        if(A.length == 0) return 0;
        int sum = 0, max = A[0];
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            if(max < sum) max = sum;
            if(sum < 0)  sum = 0;
        }
        return max;
    }
    public static void main(String[] args){
        largestsum res = new largestsum();
        int[] rr = new int[]{-20,10,-10,3,2,-10,-2,-5,-4};
        int aa = res.maxSubArray(rr);
        System.out.println("result==" + aa);
    }
}
