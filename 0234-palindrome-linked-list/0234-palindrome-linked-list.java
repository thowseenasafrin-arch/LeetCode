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
    public boolean isPalindrome(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while(fast !=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode currnode =slow,next,prev=null;
        while (currnode !=null){
            next=currnode.next;
            currnode.next=prev;
            prev=currnode;
            currnode=next;
        }
        ListNode first=head,sec=prev;
        while(first!=slow){
            if(first.val!=sec.val)
            return false;
        first=first.next;
        sec=sec.next;

        }
        return true;
    }
}