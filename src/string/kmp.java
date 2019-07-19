package string;

public class kmp {

    public int[] getNext(String p){
        int plen = p.length();
        int k = -1;
        int j = 0;
        int[] next = new int[plen];
        next[0] = -1;
        while (j < plen - 1){
            if (k == -1 || p.charAt(k) == p.charAt(j)){
                k++;
                j++;
                next[j] = k;
            }else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args){
        String pp = "AAADCDKHJ";
        kmp res = new kmp();
        int[] next = res.getNext(pp);
        for (int r :next){
            System.out.println(r);
        }
    }
}
