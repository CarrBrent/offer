package offer;

/**
 * Created by jiashilin on 2017/5/15.
 */

//该问题主要 是考查编码的完整性，需要考虑多种情况，例如
// 怎样判断base是不是等于0，不能用==0因为有误差。
//exponent是否是负数。最后结果是否会超出double的最大范围
// 另外，还要考虑效率问题，可以分单双数进行分别讨论，
// b^([n-1)/2]*b^[(n-1)/2]*b
// b^(n/2)*b^(n/2)
public class a12_Power {
    public static double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        if (base - 0 >-0.0000001 && base - 0<0.0000001) {
            return 0;
        }
        if (exponent<0 ) {
            exponent = exponent*(-1);
            return 1/pow(base,exponent);
        }else {
            return pow(base, exponent);
        }
    }

    private static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        double result = pow(base,exponent>>1);
        if (exponent%2 == 1) {
            result = result*result*base;
        }else{
            result = result*result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,4));
    }
}
