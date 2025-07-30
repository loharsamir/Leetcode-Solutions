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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)return head;
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0)return head;
        tail.next=head;
        k=k%len;
        ListNode newNode=rotatePoint(head,len-k);
        head=newNode.next;
        newNode.next=null;
        return head;
    }
    public ListNode rotatePoint(ListNode head, int idx){
        int count=1;

        while(head!=null){
            if(count==idx){
                return head;
            }
            count++;
            head=head.next;
        }
        return head;
    }
}