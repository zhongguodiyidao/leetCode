package leetcode;

public class Test21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode zhen = result;
        while (l1!=null && l2!=null){
            if(l1.val <= l2.val){
                result.next = new ListNode(l1.val);
                l1 = l1.next;
                result = result.next;
            }else{
                result.next = new ListNode(l2.val);
                l2 = l2.next;
                result = result.next;
            }
        }
        if(l1!=null){
            result.next = l1;
        }
        if(l2!=null){
            result.next = l2;
        }
        return zhen.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode listNode = new Test21().mergeTwoLists(l1, l2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
