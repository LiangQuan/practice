package caculate;

public class Power {
    /**
     * 2的16次放相当于2的8次方乘以2的8次方
     * 2的17次方相当于2的8次方乘以2的8次方乘以2，可以利用递归实现以上逻辑
     * @param base
     * @param exp
     * @return
     */
    public int  getPower(int base, int exp){
        //首先不考虑负数情况
        if (exp == 0){return 1;}
        if (exp == 1){return base;}
        //判断exp的奇偶性
        int tmp = (exp & 1) == 1 ? base : 1;
        System.out.println("====");
        System.out.println(tmp);
        System.out.println("====");
        exp = (exp & 1) == 1 ? exp - 1 : exp;
        //获取值
        int result =  tmp * getCaculate(base, exp);
        return result;
    }
    public int getCaculate(int base, int exp){
        if (exp == 0){return  1;}
        if (exp == 1){return  base;}
        int res = getCaculate(base, exp >> 1);
        res *=res;
        if ((exp & 1) == 1){res *= base;}
        return res;

    }
    public static void main(String args[]){
        Power handle = new Power();
        int res = handle.getPower(2, 6);
        System.out.println("--------------");
        System.out.println(res);
        System.out.println("--------------");
    }
}
