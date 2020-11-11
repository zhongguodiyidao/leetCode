package jianzhioffer;
/*
* 斐波那契数列
* */
public class Test10 {
    public static int fib(int n) {
        int f1=0,f2=1;
        int num = 0;
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else {
            for(int i=2;i<=n;i++){
                num = (f1+f2)%1000000007;
                f1 = f2;
                f2 = num;

            }
        }
        return num;
    }
    public static int compute(int number)
    {
        if(number<2)
        {
            return number;
        }
        else
        {
            return compute(number-1)+compute(number-2);
        }
    }

    public static void main(String[] args) {
        int fib = fib(5);
        System.out.println(fib);
        int compute = compute(4);
        System.out.println(compute);
    }
}
