// task №682

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String s : operations) {
            switch (s) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int temp = stack.pop();
                    int res = stack.peek() + temp;
                    stack.push(temp);
                    stack.push(res);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) sum += stack.pop();
        return sum;
    }
}
