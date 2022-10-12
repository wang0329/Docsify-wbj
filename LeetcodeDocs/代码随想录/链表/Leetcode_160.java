package 代码随想录.链表;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/12/17:01
 * @since: 1.8
 */
public class Leetcode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;ListNode pB = headB;
        while(pA != pB){
            pA = pA == null ? headB :pA.next;
            pB = pB == null ? headA :pB.next;
        }
        return pA;
    }
}
