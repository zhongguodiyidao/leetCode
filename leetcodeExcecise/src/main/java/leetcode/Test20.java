package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test20 {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<Character, Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        if(s.length() % 2 !=0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if(s.charAt(i) == map.get(pop)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
