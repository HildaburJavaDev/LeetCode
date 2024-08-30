// task №141

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        while(head != null) {
            if (visitedNodes.contains(head)) return head;
            visitedNodes.add(head);
            head = head.next;
        }
        return null;
    }
}
