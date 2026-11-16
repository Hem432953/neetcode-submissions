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
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode head2=slow.next;
       ListNode curr2=head2;
       ListNode prev=null;
       ListNode stepAhead=head2;
       while(curr2!=null){
            stepAhead=curr2.next;
            curr2.next=prev;
            prev=curr2;
            curr2=stepAhead;
       }
       slow.next=null;
       curr2=prev;
       ListNode curr1=head;
       while(curr2!=null){
        ListNode next1=curr1.next;
        ListNode next2=curr2.next;
        curr1.next=curr2;
        curr2.next=next1;
        curr1=next1;
        curr2=next2;
       }
        
    }
}
//  ListNode curr=head;
//         int length=0;
//         while(curr!=null){
//             length++;
//             curr=curr.next;
//         } 
//         curr=head;
//         ListNode dummy1=new ListNode(-1);
//         ListNode curr1=dummy1;
//         ListNode dummy2=new ListNode(-1);
//         ListNode curr2=dummy2;
//         int count=0;
//         int mid=length/2;
//         while(count<length){
//             if(count<=mid){
//                 curr1.next=curr;
//                 curr1=curr1.next;
//             }
//             else{
//                 curr2.next=curr;
//                 curr2=curr2.next;
//             }
//             count++;
//             curr=curr.next;
//         }
//         curr1.next=null;
//         curr2.next=null;
//         curr1=dummy1.next;
//         curr2=dummy2.next;
//         ListNode prev=null;
//         ListNode stepAhead=curr2;
//         while(curr2!=null){
//             stepAhead=curr2.next;
//             curr2.next=prev;
//             prev=curr2;
//             curr2=stepAhead;
//         }
//         curr2=prev;
//         while(curr2!=null){
//            ListNode next1=curr1.next;
//            ListNode next2=curr2.next;
//            curr1.next=curr2;
//            curr2.next=next1;
//            curr1=next1;
//            curr2=next2;
//         }