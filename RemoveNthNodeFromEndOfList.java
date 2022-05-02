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
 
 // 19.problems/remove-nth-node-from-end-of-list
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1 && head.next == null){
            return null;
        }
        int count = 0;
        ListNode headNode = head;
        while(headNode != null){
            count = count + 1;
            headNode = headNode.next;
        }
        count = count - n - 1;
        if(count < 0){
            return head.next;
        }
        headNode = head;
        int count2=0;
        while(headNode.next!=null){
            if(count2 == count){
                ListNode tempNode = headNode.next;
                headNode.next = tempNode.next;
                break;
            }
            headNode = headNode.next;
            count2 = count2 + 1;
        }
        return head;
    }
}
