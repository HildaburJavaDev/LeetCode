// task №729

class MyCalendar {

    class Node {
        int start, end;
        Node left, right;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    Node root;

    public MyCalendar() {
    }

    public boolean book(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
            return true;
        }
        Node current = root;

        while(current != null) {
            if (end <= current.start) {
                if (current.left == null) {
                    current.left = new Node(start, end);
                    return true;
                }
                current = current.left;
            } else if (start >= current.end) {
                if (current.right == null) {
                    current.right = new Node(start, end);
                    return true;
                }
                current = current.right;
            } else return false;
        }
        return false;
    }
}
