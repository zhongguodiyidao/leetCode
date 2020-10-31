package leetcode;


public class Test19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode quick = head;
        int length = 0;
        while (quick!=null){
            quick = quick.next;
            length++;
        }
        quick = head;
        if(length == 1){
            return null;
        }
        if(n==1){
            while (length>2){
                quick = quick.next;
                length--;
            }
            quick.next = null;
            return head;
        }
        int m = length-n+1;
        if(m==1){
            head = head.next;
        }else if(m == length){
            for (int i = 0 ;i<length-1;i++){
                quick = quick.next;
            }
            quick.next = null;
        }else {
            quick = head;
            for(int i = 0;i<m-2;i++){
                quick = quick.next;
            }
            quick.next = quick.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode1 = new ListNode((1));
        new Test19().removeNthFromEnd(listNode1,1);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }
}
