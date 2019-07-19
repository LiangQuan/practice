package array;

import java.util.ArrayList;

public class spiralarray {
    public ArrayList getSpiral(int[][] spirt){
        int rowlen = spirt.length;
        int collen = spirt[0].length;
        if (rowlen == 0){
            return null;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        int rowbegin = 0;
        int colbegin = 0;
        while (rowbegin < rowlen && colbegin < collen){
            for (int j = colbegin;j < collen;j++){
                res.add(spirt[rowbegin][j]);
            }
            rowbegin++;

            for (int i = rowbegin ; i < rowlen;i++){
                res.add(spirt[i][collen-1]);
            }
            collen--;

            for (int j = collen-1;j >= colbegin;j--){
                res.add(spirt[rowlen-1][j]);
            }

            rowlen--;
            for (int i = rowlen-1;i >= rowbegin;i--){
                res.add(spirt[i][colbegin]);
            }
            colbegin++;
        }
        return res;
    }

    public static void main(String[] args){
        spiralarray res = new spiralarray();
        int[][] aa = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        ArrayList<Integer> re = res.getSpiral(aa);

        for (int val = 0; val < re.size();val++){
            System.out.println(re.get(val));
        }
    }
}
