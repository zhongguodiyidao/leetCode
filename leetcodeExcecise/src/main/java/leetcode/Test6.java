package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public String convert(String s, int numRows) {
        int tt = 0;
        List<StringBuilder> strs = new ArrayList<StringBuilder>();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<numRows;i++){
            strs.add(new StringBuilder());
        }
        int index= 0;
        for(int i = 0;i<s.length();i++){
            if(tt == 0){
                strs.get(index).append(s.charAt(i));
                index++;
                if(index == numRows-1){
                    tt = 1;
                }
            }else {
                strs.get(index).append(s.charAt(i));
                index--;
                if(index == 0){
                    tt = 0;
                }
            }
        }
        for(int i=0;i<numRows;i++){
            result.append(strs.get(i));
            System.out.println("strs"+strs.get(i));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        String convert = new Test6().convert(s, 3);
        System.out.println(convert);
    }
}
