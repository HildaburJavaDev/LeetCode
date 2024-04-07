package medium;

class AddTwoNumbers {

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
		// ListNode list_1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
		// ListNode list_2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
		ListNode list_1 = new ListNode(9, null);
		ListNode list_2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))))))));
		ListNode answer = addTwoNumbers(list_1, list_2);
		while (answer != null) {
			System.out.print(answer.val);
			answer = answer.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int remainder = 0;
		ListNode answerList = new ListNode(
				(l1.val + l2.val + remainder >= 10) ? ((l1.val + l2.val) % 10) : (l1.val + l2.val));
		remainder = (l1.val + l2.val >= 10) ? 1 : 0;
		l1 = l1.next != null ? l1.next : null;
		l2 = l2.next != null ? l2.next : null;
		ListNode answer = answerList;
		while (l1 != null || l2 != null || remainder != 0) {
			System.out.println("remainder = " + remainder);
			int digit1 = (l1 != null) ? l1.val : 0;
			int digit2 = (l2 != null) ? l2.val : 0;
			// System.out.println(digit1 + " " + digit2);
			ListNode newNode = new ListNode(
					(digit1 + digit2 + remainder >= 10) ? ((digit1 + digit2 + remainder) % 10)
							: (digit1 + digit2 + remainder));
			remainder = (digit1 + digit2 + remainder >= 10) ? 1 : 0;
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
			answerList.next = newNode;
			answerList = newNode;
		}
		return answer;
	}
}