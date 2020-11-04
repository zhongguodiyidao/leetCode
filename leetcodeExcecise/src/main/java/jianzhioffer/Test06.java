package jianzhioffer;

import java.util.Arrays;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Test06 {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(head!=null){
            len++;
            stack.push(head.val);
            head = head.next;
        }

        int[] nums = new int[len];
        int i=0 ;
        while(!stack.isEmpty()){
            nums[i++] = stack.pop();
        }
        return nums;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(3,new ListNode(2,null)));
        int[] ints = new Test06().reversePrint(l1);
        Arrays.toString(ints);


    }
}
