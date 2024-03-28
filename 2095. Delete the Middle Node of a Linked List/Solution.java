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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        int c = 0;
        while (curr != null) {
            c++;
            curr = curr.next;
        }
        if (c == 1) {
            head = null;
            return head;
        }
        int mid = (c / 2) - 1;
        c = 0;
        ListNode temp = head;
        while (c < mid) {
            c++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}


