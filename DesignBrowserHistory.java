// task №1472

class Node{
    String page;
    Node next;
    Node prev;

    public Node(String page){
        this.page = page;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    Node historyNode;
    public BrowserHistory(String homepage) {
        historyNode = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        historyNode.next = newNode;
        newNode.prev = historyNode;
        historyNode = newNode;
    }
    
    public String back(int steps) {
        Node temp = historyNode;
        while(steps != 0 && temp.prev != null) {
            steps--;
            temp = temp.prev;
        }
        historyNode = temp;
        return historyNode.page;
    }
    
    public String forward(int steps) {
        Node temp = historyNode;
        while(steps != 0 && temp.next != null) {
            steps--;
            temp = temp.next;
        }
        historyNode = temp;
        return historyNode.page;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
