package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test22 {
    List<String> res = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private void dfs(int left, int right, String curStr) {
        if(left ==0 &&right == 0){
            res.add(curStr);
            return;
        }
        if(left>0){
            dfs(left-1,right,curStr+"(");
        }
        if(right>left){
            dfs(left,right-1,curStr+")");
        }
    }

    public static void main(String[] args) {
        new Test22().generateParenthesis(2);

    }
}
