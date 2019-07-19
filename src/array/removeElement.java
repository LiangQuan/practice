package array;

public class removeElement {
    public int getNewLen(int[] arr, int key){
        if (arr.length == 0){
            return 0;
        }
        int j = 0;
        for (int i=0; i < arr.length ; i++){
            if (arr[i] == key){
                continue;
            }
            arr[j] = arr[i];
            j++;
        }
        return j;
    }
    public static void main(String[] args){
        removeElement res = new removeElement();
        System.out.println("begin----------");
        int index = res.getNewLen(new int[]{3,4,5,6,6,10}, 6);
        System.out.println("end-------"+index);

    }
}
