package array;

public class binarysearch {

    public int searchbinarylow(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] <= key){
                if (arr[mid+1] > key){
                    return mid;
                }else {
                    start = mid;
                }
            }else {
                end = mid;
            }
        }
        return -1;
    }
    public int searchbinaryhigh(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] >= key){
                if (arr[mid-1] < key){
                    return mid;
                }else {
                    end = mid;
                }
            }else {
                start = mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr =new int[]{1,5,8,8,9};
        binarysearch res = new binarysearch();
        int target = res.searchbinarylow(arr,8);
        int target1 = res.searchbinaryhigh(arr,8);
        System.out.println(target);
        System.out.println(target1);
    }
}
