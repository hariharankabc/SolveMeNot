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
 // 876. problems/middle-of-the-linked-list/
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode headNode = head;
        while(headNode.next!=null){
            headNode = headNode.next;
            count = count + 1;
        }
        count = (count+1)/2;
        headNode = head;
        int count2=0;
        while(headNode.next!=null){
            headNode = headNode.next;
            count2 = count2 + 1;
            if(count2 == count){
                break;
            }
        }
        return headNode;
    }
}
