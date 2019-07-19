package sort;

public class mergesort {
    public int[] mersort(int[] arr, int l, int h){
        if (l==h){
            return new int[]{arr[l]};
        }
        int mid = l +(h-l)/2;
        int[] left = mersort(arr,l,mid);
        int[] right = mersort(arr,mid+1,h);
        int[] temp = new int[left.length + right.length];
        int i=0, j=0,m=0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                temp[m] = left[i];
                m++;
                i++;
            }else{
                temp[m] = right[j];
                m++;
                j++;
            }
        }
        while (i < left.length){
            temp[m++]=left[i++];
        }
        while (j < right.length){
            temp[m++]=right[j++];
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr =new int[]{33,2,5,11,75,24,35};
        mergesort res = new mergesort();
        int[] temp = res.mersort(arr,0,arr.length-1);
        for (int i=0;i<temp.length-1;i++){
            System.out.println(temp[i]);
        }
    }
}
