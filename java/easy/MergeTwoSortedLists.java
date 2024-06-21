class MergeTwoSortedLists {

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
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
		output(mergeTwoLists(list1, list2));
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode result;
		if (list1.val < list2.val) {
			result = list1;
			list1 = list1.next;
		} else {
			result = list2;
			list2 = list2.next;
		}

		ListNode output = result;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				result.next = list1;
				list1 = list1.next;
			} else {
				result.next = list2;
				list2 = list2.next;
			}
			result = result.next;
		}
		if (list1 != null) {
			result.next = list1;
		} else {
			result.next = list2;
		}
		return output;
	}

	public static void output(ListNode list) {
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}
}
