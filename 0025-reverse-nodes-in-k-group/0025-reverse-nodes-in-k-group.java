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
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) {
            return head;
        }

        // Dummy node helps handle changes to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {

            // Step 1: Check whether k nodes are available
            ListNode kth = groupPrev;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            // Fewer than k nodes remain
            if (kth == null) {
                break;
            }

            // Step 2: Save the next group's starting node
            ListNode groupNext = kth.next;

            // Step 3: Reverse current group
            ListNode groupHead = groupPrev.next;

            ListNode prev = groupNext;
            ListNode curr = groupHead;

            while (curr != groupNext) {

                ListNode next = curr.next;

                curr.next = prev;

                prev = curr;
                curr = next;
            }

            // Step 4: Connect reversed group
            groupPrev.next = kth;

            // Step 5: Move to the next group
            groupPrev = groupHead;
        }

        return dummy.next;
    }
}
