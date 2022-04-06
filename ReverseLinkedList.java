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

// 206.problems/reverse-linked-list/
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode tempNext = head.next;
        ListNode tempNextTwo;
        head.next = null;
        while(tempNext != null){
            tempNextTwo = tempNext.next;
            tempNext.next = head;
            head = tempNext;
            tempNext = tempNextTwo;
        }
        return head;
    }
}
