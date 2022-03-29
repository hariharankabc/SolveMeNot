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
// 203 problems/remove-linked-list-elements/ [NB]
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode headNode = null;
        if(head != null && head.next == null){
            if(head.val == val){
                return headNode;
            }else{
                return head;
            }
        }
        while(head != null && head.next != null){
            ListNode tempNode = head.next;
            if(head.val == val){
               head = head.next;
                if(headNode == null && head.next == null && head.val != val){
                    headNode = head;
                }
            }else{
                if(headNode == null){
                    headNode = head;
                }
            if(tempNode.val == val){
                head.next = tempNode.next;
            }else{
                head = head.next;
            }
            }
        }
        return headNode;
    }
}
