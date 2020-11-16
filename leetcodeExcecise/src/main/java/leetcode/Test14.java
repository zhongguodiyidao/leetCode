package leetcode;

public class Test14 {
    public static String longestCommonPrefix(String[] strs) {
        String atr = "";
        if(strs.length == 0){
            return atr;
        }
        int len = strs[0].length();
        for(int i = 1; i < strs.length ;i++){
            if(strs[i].length()<len)
                len = strs[i].length();
        }
        boolean aaa = true;
        int num = 0;
        for(int j = 0;j<len;j++){
            aaa = true;
            char flag = strs[0].charAt(num);
            for (int i = 1;i<strs.length;i++){
                if(flag!=strs[i].charAt(num)){
                    aaa = false;
                    break;
                }else {
                    continue;
                }
            }
            if(aaa){
                atr = atr+flag;
                num++;
            }else {
                break;
            }
        }
        return atr;
    }
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
