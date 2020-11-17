package leetcode;
/*
* 盛水最多的容器
* */
public class Test11 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0;i<height.length;i++){
            for(int j = 1;j<height.length;j++){
                max =Math.max(Math.abs(i-j)*Math.min(height[i],height[j]),max);
            }
        }
        return max;
    }
}
