package jianzhioffer;
/*
* 青蛙跳水问题
* 使用动态规划 重复使用记录之前所使用的相同的空间 f(n) = f(n-1) + f(n-2)
* */
public class Test10_2 {
    public int numWays(int n) {
        if(n<=1){
            return 1;
        }else if(n==2){
            return 2;
        }
        int f1=1,f2=2;
        for(int i = 3;i<=n;i++){
            int flag = (f1+f2)%1000000007;
            f1 = f2;
            f2 = flag;
        }
        return f2;
    }
    /*
    * 使用递归耗时消耗空间时间，不建议使用
    * 代码简洁易理解
    * */
    public int numWays1(int n) {
        if(n<=1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return numWays1(n-1)%1000000007 + numWays1(n-2)%1000000007;
    }

    public static void main(String[] args) {
        int i = new Test10_2().numWays1(43);
        int i1 = new Test10_2().numWays(43);
        System.out.println(i);
        System.out.println(i1);
    }
}
