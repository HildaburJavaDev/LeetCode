package medium;

// task № 19

public class RemoveNthNodeFromTopOfList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		ListNode answer = removeNthFromEnd(
				new ListNode(1, new ListNode(2, null)), 2);
		while (answer != null) {
			System.out.print(answer.val + " ");
			answer = answer.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 1;
		ListNode node = new ListNode(head.val, head.next);
		while (node.next != null) {
			length++;
			node = node.next;
		}
		int currentPos = 1;
		node = head;
		while (currentPos != length - n && node.next != null) {
			node = node.next;
			currentPos++;
		}
		if (length == n) {
			head = head.next;
		} else if (node.next == null) {
			return null;
		} else {
			node.next = node.next.next;
		}
		return head;
	}
}
