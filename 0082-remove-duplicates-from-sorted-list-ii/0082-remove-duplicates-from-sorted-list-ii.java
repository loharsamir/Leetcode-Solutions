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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode left=temp;
        ListNode right=head;
        while(right!=null){
            boolean duplicate=false;
            while(right.next!=null && right.val==right.next.val){
                right=right.next;
                duplicate=true;
            }
            if(duplicate){
                left.next=right.next;
                
            }else{
                left=left.next;
            }
            right=right.next;
        }
        return temp.next;
    }
}