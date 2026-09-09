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

        // If removing the first node
        if (n == s) {
            return head.next;
        }

        // Move to node before the node to remove
        for (int i = 1; i < s - n; i++) {
            head = head.next;
        }

        // Remove the node
        head.next = head.next.next;

        return originalHead;
    }
}