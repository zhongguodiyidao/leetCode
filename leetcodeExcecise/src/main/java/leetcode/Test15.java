package leetcode;

import java.util.*;

public class Test15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Arrays.toString(nums);
        Set<List<Integer>> hashSet = new HashSet<List<Integer>>();
        List<Integer> ints = new ArrayList<Integer>();
        for(int i = 0;i <nums.length;i++){
            ints.add(nums[i]);
        }
        System.out.println(ints.size());
        System.out.println(ints.get(0));
        for(int i = 0;i<ints.size();i++){
            if(i-1>=0&&nums[i]==nums[i-1]){//如果当前数和前一个数相同，则跳过，因为肯定会重复
                continue;
            }
            for(int j =i+1;j<ints.size();j++){
                int flag = nums[i] + nums[j];
                if(ints.contains(-flag)){
                    List bbb = new ArrayList(ints);
                    bbb.remove(i);
                    bbb.remove(j-1);
                    if(bbb.contains(-flag)){
                        List<Integer> aaa = new ArrayList<Integer>();
                        aaa.add(nums[i]);
                        aaa.add(nums[j]);
                        aaa.add(-flag);
                        hashSet.add(aaa);
                        System.out.println(aaa);
                    }

                }
            }
        }
        return new ArrayList<List<Integer>>(hashSet);
    }
    public static List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> hashSet = new HashSet<List<Integer>>();
        List<Integer> fushu = new ArrayList<Integer>();
        List<Integer> zhengshu = new ArrayList<Integer>();
        List<Integer> zero = new ArrayList<Integer>();
        for(int i = 0; i < nums.length ;i++){
            if(nums[i]<0){
                fushu.add(nums[i]);
            }else if(nums[i]>0){
                zhengshu.add(nums[i]);
            }else {
                zero.add(nums[i]);
            }
        }
        if(zero.size()>=3){
            List<Integer> aaa = new ArrayList<Integer>();
            aaa.add(0);
            aaa.add(0);
            aaa.add(0);
            hashSet.add(aaa);
        }
        //一正一负
        if(zero.size() > 0){
            for(int i = 0;i<fushu.size();i++){
                if(zhengshu.contains(Math.abs(fushu.get(i)))){
                    List<Integer> aaa = new ArrayList<Integer>();
                    aaa.add(fushu.get(i));
                    aaa.add(0);
                    aaa.add(-fushu.get(i));
                    hashSet.add(aaa);
                }
            }
        } //两正一负，两负一正
        for(int i = 0;i<fushu.size();i++){
            if(i-1>=0&&nums[i]==nums[i-1]){//如果当前数和前一个数相同，则跳过，因为肯定会重复
                continue;
            }
            for(int j = i+1; j < fushu.size();j++){

                int flag = fushu.get(i) + fushu.get(j);
                if(zhengshu.contains(-flag)){
                    List<Integer> aaa = new ArrayList<Integer>();
                    aaa.add(fushu.get(i));
                    aaa.add(fushu.get(j));
                    aaa.add(-flag);
                    hashSet.add(aaa);
                }
            }
        }
        for(int i = 0;i<zhengshu.size();i++){
            for(int j = i+1; j<zhengshu.size();j++){
                int flag = zhengshu.get(i)+zhengshu.get(j);
                if(fushu.contains(-flag)){
                    List<Integer> aaa = new ArrayList<Integer>();
                    aaa.add(-flag);
                    aaa.add(zhengshu.get(i));
                    aaa.add(zhengshu.get(j));
                    hashSet.add(aaa);
                }
            }
        }
        return new ArrayList<List<Integer>>(hashSet);
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists.size());
        System.out.println(lists);
    }
}
