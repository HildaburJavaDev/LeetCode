// task №2807

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
  private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
        return a;
  }

  public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode prev = head;

    while (prev.next != null) {
        ListNode newNode = new ListNode(gcd(prev.val, prev.next.val), prev.next);
        prev.next = newNode;
        prev = newNode.next;
    }
    return head;
  }
}
