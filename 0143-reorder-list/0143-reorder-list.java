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
       if(head==null || head.next==null){
        return ;
       } 
       ListNode mid=head;
       ListNode fast=head;
       while(fast!=null &&fast.next!=null){
        mid=mid.next;
        fast=fast.next.next;
       }
       ListNode second=mid.next;
       mid.next=null;
       ListNode prev=null;
       ListNode current=second;
       while(current!=null){
        ListNode next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       second=prev;
       ListNode first=head;
       while(second!=null){
        ListNode temp1=first.next;
        ListNode temp2=second.next;
        first.next=second;
        second.next=temp1;
        first=temp1;
        second=temp2;
       }
    }
}