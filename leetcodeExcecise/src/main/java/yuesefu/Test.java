package yuesefu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n  = 100000; //给数组个大数
        int people_numbers = 5;
        int count = people_numbers;
        int m = 3;//用来记录每个人的报数
        Integer init_first;//从第几个人开始数
        int num = 0; //记录报的数
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split(",");
        people_numbers = Integer.parseInt(strings[0]);
        m = Integer.parseInt(strings[1]);
        count = people_numbers;

       int[] peoples = new int[n];
       int flag[] = new int[n];
       //所有人入圈
       for(int i = 1; i <= people_numbers; i++){
           peoples[i] = i;
           flag[i] = 1;
       }
       //出圈算法
        while (count!=1){
                for(int i = 1 ; i<= people_numbers ;i++){
                    if(flag[i] == 1){
                        num++;
                        if(num == m){
                            flag[i] = 0;
                            count--;
                            num = 0;
                            System.out.print(i+" ");
                        }
                    }
                }
        }
        for(int i =1;i<=people_numbers;i++){
            if (flag[i]==1){
                System.out.print(i);
            }
        }
    }
}
