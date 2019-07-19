package string;

public class longestpalindstring {

    public int getPalindString(String str){
        int len = str.length();
        if (len == 0){
            return 0;
        }
        int i = 0;
        int maxlen = 0;
        for (i = 0; i < len ; i++){
            //偶数项
            int left;
            int right;
            int curentlen =0;
            int begin = 0;
            if (len%2 == 0){
                left = i;right=i+1;
            }else {
                left = i-1;right=i+1;curentlen=1;

            }
            while (right < len && left >= 0 && (str.charAt(left) == str.charAt(right))){

                left--;
                right++;
                curentlen +=2;
                if (curentlen > maxlen){
                    maxlen = curentlen;

                }

            }
        }
        return maxlen;

    }

    public static void main(String[] args){
        String str = "werrew";
        System.out.println("begin----------");
        longestpalindstring res =  new longestpalindstring();
        System.out.println("res----------");
        System.out.println(res.getPalindString(str));
        System.out.println("end-------");
    }
}
