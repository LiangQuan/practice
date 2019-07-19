package sort;

public class quicksort {
    public void sortquick(int[] data, int left, int right){
        if (data.length <= 0){
            return;
        }
        if (left >= right){
            return;
        }
        int key = data[left];
        int begin = left;
        int end = right ;
        int start = left;
        //从右开始，比key大的在右，比key小的替换到左边
        while (start < end){
            while (data[end] > key && start < end){
                end--;
            }
            data[start] = data[end];
            while (data[start] <= key && start < end) {
                start++;
            }
            data[end] = data[start];
        }
        data[start] = key;
        sortquick(data, 0, start-1);
        sortquick(data, start+1, right);
    }
    public static void main(String[] args){
        quicksort res = new quicksort();
        int[] arr = new int[]{4,5,2,77,44,13,14,16};
        res.sortquick(arr,0,arr.length -1);
        for (int i=0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
