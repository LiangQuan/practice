
public class Kmp {
    /**
     * @desc  暴力搜索方法
     * @param s
     * @param p
     * @return
     */
    public int ViolentMatch(String s,String p ) {
        int sint = s.length();
        int pint = p.length();
        if(pint > sint) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while(i < sint) {
            if(j == pint-1) {
                return i-j;
            }
            if(s.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            }else {
                i = i-j+1;
                j = 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "qeeryweertyuio";
        String p = "ert";
        Kmp kmp = new Kmp();
        int result = kmp.ViolentMatch(s, p);
        System.out.println("hello work" + result);
    }

}
