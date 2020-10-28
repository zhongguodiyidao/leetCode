package leetcode;

public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int[] hashtab = new int[256];
        int max = 0;
        for(int i=0,j=0; i < s.length();i++){
            hashtab[s.charAt(i)]++;  //循环执行一次此处字符的ascii码在hashtab中的值加一
            while(hashtab[s.charAt(i)]>1){
                hashtab[s.charAt(j)]--;
                j++;
            }
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int aaaaaaaaaaa = new Test3().lengthOfLongestSubstring("abcb");
        System.out.println(aaaaaaaaaaa);
    }
}
