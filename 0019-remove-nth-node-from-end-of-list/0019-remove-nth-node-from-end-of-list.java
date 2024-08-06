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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        int len = countNode(head);
        ListNode temp = head;
        ListNode pre = null;
        if(len==n){
            head = head.next;
            return head;
        }
        len = len - n;
        while(len-- >= 1){
            pre = temp;
            temp = temp.next;
        }
        if(temp == null){
            pre.next = null;
            return head;
        }
        pre.next = temp.next;
        return head;
    }
    int countNode(ListNode temp){
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}