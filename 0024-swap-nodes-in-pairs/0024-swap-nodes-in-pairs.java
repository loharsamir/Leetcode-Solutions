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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode left=head;
        ListNode right=left.next;
        
        while(left != null && right != null){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
            left = (right.next != null) ? right.next : null;
            right = (left != null) ? left.next : null;
        }
        return head;
    }
}