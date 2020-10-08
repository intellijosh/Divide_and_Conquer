/*In depth program reviewing divide and conquer algorithms. Benefits are speed. D&C is employed mostly
by quicksort, mergesort, binary search, closest pair, and Strassens algorithm. Joshua S. */

public class Exponential {
    public static int exponent(int base, int power){
        if(power == 0){
            return 1;
        }else{
            return base * exponent(base, power-1);
        }
    }
    public static int DNC(int base, int power){
        if(power == 0){
            return 1;
        }else{
            int halfway = exponent(base, power/2); //recursive call passing power divided by 2
            int full = halfway * halfway;
            if(power % 2 ==1){                          //checking to see if the power is odd
                full = full * base;                     //and if so we do an extra multiplication times the base
            }
            return  full;
        }
    }
    public static void main(String[] args){
       int sum= exponent(2,3);
       int sum2 = DNC(3,0);
       System.out.println(sum);
       System.out.println(sum2);
    }
}
