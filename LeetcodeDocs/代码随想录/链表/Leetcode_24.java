package 代码随想录.链表;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/12/16:41
 * @since: 1.8
 */
public class Leetcode_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;

        while(pre.next != null && pre.next.next != null){
            ListNode temp = head.next.next;
            pre.next = head.next;
            head.next.next = head;
            head.next = temp;
            pre = head;
            head = head.next;
        }
        return dummy.next;
    }
}
