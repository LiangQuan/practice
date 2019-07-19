package array;

public class binarysum {
    public String sumString(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int maxlen = Math.max(alen, blen);
        //开始补位操作
        while (maxlen > a.length()){
            a = "0" + a;
        }
        System.out.println("aaaaa=" + a);
        while (maxlen > b.length()){
            b = "0" + b;
        }
        System.out.println("bbbbb=" + b);
        char tem = '0';
        char[] res = new char[maxlen + 1];
        for (int i = maxlen - 1; i >= 0; i--){
            int num = a.charAt(i) + b.charAt(i) + tem - 3*'0';
            if (num == 3){
                res[i+1] = '1';
                tem = '1';
            }else if (num == 2){
                res[i+1] = '0';
                tem = '1';
            }else if (num == 1){
                res[i+1] = '1';
                tem = '0';
            }else {
                res[i+1] = '0';
                tem = '0';
            }
        }
        System.out.println("-----------");
        System.out.println(res);
        System.out.println("-----------");
        String ss = "";
        if (tem=='1'){
            res[0]='1';
            System.out.println("----1-------");
            System.out.println(res);
            System.out.println("-----1------");
            ss = String.valueOf(res);
            System.out.println("yyyyy" + ss);
        }else {
            ss = String.valueOf(res).substring(1);
            System.out.println("ppppp" + res.toString());
        }
        return ss;
    }

    public static void main(String[] args){
        binarysum res = new binarysum();
        String a = "1111100101";
        String b = "1011010";
        String rr = res.sumString(a,b);
        System.out.println("result==" + rr);
    }
}
