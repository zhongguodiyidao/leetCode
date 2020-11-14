package leetcode;

public class Test7 {
    public int reverse(int x) {
        Integer Ix = new Integer(x);
        StringBuilder stringBuilder = new StringBuilder();
        String s = Ix.toString();
        if(s.charAt(0) == '-'){
            for(int i = s.length()-1;i>=1;i--){
                stringBuilder.append(s.charAt(i));
            }
            try{
                return 0-Integer.parseInt(stringBuilder.toString().trim());
            }catch (Exception e){
                return 0;
            }
        }else{
            for(int i = s.length()-1;i>=0;i--){
                stringBuilder.append(s.charAt(i));
            }
        }
        try{
            return Integer.parseInt(stringBuilder.toString().trim());
        }catch (Exception e){
            return 0;
        }
    }

    /**
     *
     * @param x
     * @return
     * 把原数从最后一位开始取余并往result加，每次循环result都*10往前移动一位
     */
    public int reverse1(int x) {
        int result = 0;  //记录结果
        while (x!=0){
            int tmp = result;//记录之前算的结果,如果发生溢出，那么result原值与tmp不相等返回0
            result = (result*10) + (x%10);
            x = x/10;

            if(result /10 != tmp){
                return 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Test7().reverse1(1534236469));
    }
}
