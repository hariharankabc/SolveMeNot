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
// 83. problems/remove-duplicates-from-sorted-list/ [NB]
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode temp = head;
        if(temp == null)return null;
        while(temp.next != null){
            ListNode nextNode = temp.next; 
            if(temp.val == nextNode.val){
                temp.next = nextNode.next;
                nextNode = temp.next;
                continue;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
