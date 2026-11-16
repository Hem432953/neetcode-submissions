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
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode stepAhead;
        while(curr!=null){
            // if(head==null) return null;
            // if(head.next==null) return head;
            stepAhead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=stepAhead;
        }
        head=prev;
        return prev;
    }
}
