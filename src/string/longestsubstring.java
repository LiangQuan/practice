package string;

import java.util.HashMap;

public class longestsubstring {
    public String getLongestSub(String str){
        int slen = str.length();
        HashMap<Character,Integer> res = new HashMap<Character, Integer>();
        //滑动窗口
        int sum = 0;//最长串长度
        int leftindex = 0;
        int start = 0;
        System.out.println("----111----");
        for (int i=0; i<slen;i++){
            char c = str.charAt(i);
            if (res.containsKey(c)){
                leftindex = res.get(c)+1;
            }
            if (sum < (i-leftindex+1)){
                sum = (i-leftindex+1);
                start = leftindex;
            }
            res.put(c,i);

        }
        System.out.println("--------");
        System.out.println(start);
        System.out.println("--------");
        System.out.println(sum);
        System.out.println("--------");
        return str.substring(start,start+sum);
    }

    public static void main(String[] args){
        longestsubstring ss = new longestsubstring();
        String str = "adcadc";
        System.out.println(ss.getLongestSub(str));
        for (int i=0;i<10;i++){
            final int index = i;
            System.out.println(index);
        }
    }
}
