package sort;

public class headsort{
    public void buildMaxheap(int[] arr, int currentnode, int size){
        int temp = arr[currentnode];

        for (int k = 2*currentnode +1; k < size; k = 2*k +1){
            if (k+1 < size && arr[k] < arr[k+1]){
                //左节点小于右节点指向大的节点
                k++;
            }
            if (arr[k] > temp){
                int tt = arr[currentnode];
                arr[currentnode] = arr[k];
                arr[k] = tt;
                currentnode=k;
            }else {
                break;
            }
        }
    }
    public void heapsort(int[] arr){
        //首先构建一个大顶堆，从第一个非叶子节点最后一个开始
        for (int j = arr.length/2-1; j > 0; j--){
            buildMaxheap(arr, j, arr.length);
        }

        //开始了排序逻辑
        for (int i = arr.length-1;i>0;i--){
            //根节点与最后一个交换
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //重新调整堆
            buildMaxheap(arr,0,i);
        }
    }

    public static void main(String[] args){
        int[] arr =new int[]{33,2,5,11,75,24,35};
        headsort res = new headsort();
        res.heapsort(arr);
        for (int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}