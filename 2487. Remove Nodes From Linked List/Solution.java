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
    public ListNode removeNodes(ListNode head) {
        if (head == null) return null;
        
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
        
        int max = Integer.MIN_VALUE;
        ListNode result = null;
        
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            
            if (node.val >= max) {
                max = node.val;
                node.next = result;
                result = node;
            }
        }
        
        return result;
    }
}
