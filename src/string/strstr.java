package string;

public class strstr {

    public int getStrindex(String ss, String pp){
        int slen = ss.length();
        int plen = pp.length();
        if (plen > slen){
            return -1;
        }
        for (int i=0; i < slen ; i++){
            int position = i;
            int j = 0;
            while (j < plen && ss.charAt(position) == pp.charAt(j)){
                position++;
                j++;
            }
            //说明匹配上了
            if (j == plen){
                return (position-j);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        strstr res = new strstr();
        System.out.println("begin---------");
        int index = res.getStrindex("qwertrew","rt");
        System.out.println("end---------" + index);

    }
}
