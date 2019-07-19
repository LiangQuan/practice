package array;

public class searchInsert {
    public int serIn(int[] arr, int key){
        //二分查找
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == key){
                return  mid;
            }
            if (arr[mid] < key){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }

        return start;
    }

    public static void main(String[] args){
        int[] arr =new int[]{1,5,8,9};
        searchInsert res = new searchInsert();
        int target = res.serIn(arr,6);
        System.out.println(target);
    }
}
