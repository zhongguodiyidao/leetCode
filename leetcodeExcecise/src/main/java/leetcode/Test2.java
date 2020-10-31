package leetcode;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Test2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode zhen = result;
        int jinwei = 0;
        while (l1!=null || l2!=null || jinwei!=0){
            int val1 = l1!=null? l1.val : 0;
            int val2 = l2!=null? l2.val : 0;
            int sum = val1+val2+jinwei;
            jinwei = sum/10;

            ListNode newNode = new ListNode(sum%10);
            result.next = newNode;
            result = newNode;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return zhen.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))))))));
        ListNode l2 = new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))));
        ListNode listNode = new Test2().addTwoNumbers(l1, l2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
