package qz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    //an为a,n为 n mod
    public static Long aaa(Long an, Integer n,int len){
        long bn = an;
        for(int i = 1;i <= len;i++){
            bn = bn ^ (n%i);
        }
        return bn;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        List<Long> lists = new ArrayList<Long>();
        List<Long> lists1 = new ArrayList<Long>();  //保存bn
        int n = scanner.nextInt();
        String str = scanner1.nextLine();
        String[] s = str.split(" ");

        for(int i = 0;i<s.length;i++){
            lists.add(Long.parseLong(s[i]));
        }

        for(int i = 1;i<=lists.size();i++){
            Long aaa = aaa(lists.get(i - 1), i,lists.size());
            lists1.add(aaa);
        }
        long flag=0;
        for (int i = 0;i<lists1.size();i++){
            flag = flag^lists1.get(i);
        }
        System.out.println(flag);
    }
}
