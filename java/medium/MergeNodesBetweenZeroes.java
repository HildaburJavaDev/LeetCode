// task №2182

// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = new ListNode(0);
        ListNode answerHead = current;
        boolean needAdd = false;
        while (head != null) {
            if (head.val == 0) {
                needAdd = true;
                head = head.next;
                continue;
            }
            if (needAdd) {
                if (current.val == 0) {
                    current.val += head.val;
                    answerHead = current;
                    needAdd = false;
                } else {
                    current.next = new ListNode();
                    current = current.next;
                    current.val = head.val;
                    needAdd = false;
                }
            } else {
                current.val += head.val;
                needAdd = false;
            }
            head = head.next;
        }
        return answerHead.val != 0 ? answerHead : null;
    }
}
