package string;

import java.util.*;

public class strsort {


    public ArrayList<String> getSort(ArrayList<String> liststr){
        Collections.sort(liststr);

        return liststr;
    }

    public ArrayList<String> getSort1(ArrayList<String> liststr, int begin, int len){
        //通过快速排序算法排列出来
        if (liststr==null || liststr.size() == 0){
            return null;
        }
        String strkey = liststr.get(begin);
        int end = len -1;
        int start = begin;
        while (start < end){
            while (compareString(liststr.get(end), strkey) && start < end){
                end--;
            }
            liststr.set(start, liststr.get(end));
            while (compareString(strkey, liststr.get(start)) && start < end){
                start++;
            }
            liststr.set(end,liststr.get(start));
        }
        liststr.set(start, strkey);
        getSort1(liststr,0, start-1);
        getSort1(liststr,start+1, len);
        return null;
    }

    public boolean compareString(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int minlen = Math.min(len1, len2);
        int start = 0;
        while (start < minlen){
            if (str1.charAt(start) == str2.charAt(start)){
                start++;
            }else {
                if (str1.charAt(start) > str2.charAt(start)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        //System.out.println("prefix----");
        if (len1 <= len2){
            return false;
        }else {
            return true;
        }
    }
    public static void main(String[] args){
        ArrayList<String> liststr = new ArrayList<String>();
        liststr.add("fghjk");
        liststr.add("asdf");
        liststr.add("bnm");
        liststr.add("erty");
        strsort res = new strsort();
        //res.getSort(liststr);
        boolean flag = res.compareString("qwer","qwers");
        System.out.println(flag);
    }
}
