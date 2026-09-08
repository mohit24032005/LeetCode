/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode ptr = res;
        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                int x = head.val;
                while (head != null && head.val == x) {
                    head = head.next;
                }
            } else {
                ptr.next = head;
                ptr = ptr.next;
                head = head.next;
            }
        }
        
        ptr.next = null;
        return res.next;
    }
}