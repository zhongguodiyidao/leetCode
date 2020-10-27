package qz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<Integer>();
        String[] moneys = {"100","50","20","10","5","1","0.5","0.1"};
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");

        //需要支付的钱
        double pay_money ;
        //给售货员的钱
        double geideqian;
        pay_money = Double.parseDouble(s[0]);
        geideqian = Double.parseDouble(s[1]);
        double zhaoling = Double.parseDouble(String.valueOf(geideqian-pay_money));
        System.out.print(zhaoling+" ");
                int bai = (int) (zhaoling/100);
                zhaoling = zhaoling-bai*100;
                lists.add(bai);
                int wushi = (int) (zhaoling/50);
                zhaoling = zhaoling-wushi*50;
                lists.add(wushi);
                int ershi = (int)(zhaoling/20);
                zhaoling = zhaoling-ershi*20;
                lists.add(ershi);
                int shikuai = (int) (zhaoling/10);
                zhaoling = zhaoling-shikuai*10;
                lists.add(shikuai);
                int wukuai = (int) (zhaoling/5);
                zhaoling = zhaoling -wukuai*5;
                lists.add(wukuai);
                int yikuai = (int) (zhaoling/1);
                zhaoling = zhaoling - yikuai;
                lists.add(yikuai);
                int wumao = (int) (zhaoling /0.5);
                zhaoling = zhaoling - 0.5*wumao;
                lists.add(wumao);
                int yimao = (int) (zhaoling/0.1);
                zhaoling = zhaoling - zhaoling*0.1;
                lists.add(yimao);
        for(int i=0;i<lists.size();i++){
            if(lists.get(i)!=0){
                System.out.print(moneys[i]+":"+(int)lists.get(i)+";");
            }
        }

    }
}
