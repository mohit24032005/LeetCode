class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = new ListNode(0);
        ListNode ptr = a;
        int s = 0;
        ListNode originalHead = head;

        while (head != null) {
            s++;
            head = head.next;
        }

        head = originalHead;
        if (n == s) {
            return head.next;
        }
        for (int i = 1; i < s - n; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return originalHead;
    }
}