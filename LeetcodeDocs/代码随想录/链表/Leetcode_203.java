package 代码随想录.链表;


/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/12/11:45
 * @since: 1.8
 */
public class Leetcode_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1,head);
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
