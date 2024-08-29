// task №24

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
        if (head == null || head.next == null) return head;
        ListNode first = head.next;
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode nextPair = current.next.next;
            ListNode temp = current.next;
            temp.next = current; 
            current.next = (nextPair != null && nextPair.next != null) ? nextPair.next : nextPair; 
            current = nextPair;
        }

        return first;
    }
}
