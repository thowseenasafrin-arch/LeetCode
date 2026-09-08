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
    public ListNode swapNodes(ListNode head, int k) {
        // Find length of the list and the kth node from the beginning
        ListNode first = head;
        int n = 0;
        ListNode kthFromStart = null;
        
        for (ListNode node = head; node != null; node = node.next) {
            n++;
            if (n == k) {
                kthFromStart = node;
            }
        }
        
        // kth from end is the (n - k + 1)th from start
        int stepsFromStart = n - k + 1;
        ListNode kthFromEnd = head;
        for (int i = 1; i < stepsFromStart; i++) {
            kthFromEnd = kthFromEnd.next;
        }
        
        // Swap values
        int temp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = temp;
        
        return head;
    }
}  
    