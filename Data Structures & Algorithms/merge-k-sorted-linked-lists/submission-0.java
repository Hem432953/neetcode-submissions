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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
       
        ListNode mergedLists=lists[0];
        for(int i=0;i<lists.length-1;i++){
            ListNode current=lists[i+1];
            mergedLists=mergeList(mergedLists,current);
        }

     return mergedLists;

    }
          public  ListNode mergeList(ListNode mergedLists,ListNode current){
            ListNode ll=new ListNode(-1);
            ListNode dummy=ll;
            ListNode curr1=mergedLists;
            ListNode curr2=current;
            while(curr1!=null&&curr2!=null){
                if(curr1.val<=curr2.val){
                    ll.next=curr1;
                    curr1=curr1.next;
                }
                else{
                    ll.next=curr2;
                    curr2=curr2.next;
                }
                ll=ll.next;
            }
            if(curr1!=null){
                ll.next=curr1;
            }
            if(curr2!=null){
                ll.next=curr2;
            }
            return dummy.next;
        }
}
