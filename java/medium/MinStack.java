// task №155

class MinStack {
    private List<int[]> list;
    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        if (list.isEmpty()) {
            list.add(new int[] {val, val});
        } else {
            int min = list.get(list.size() - 1)[1];
            list.add(new int[] {
                val,
                val < min ? val : min
            });
        }
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1)[0];
    }
    
    public int getMin() {
         return list.get(list.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
