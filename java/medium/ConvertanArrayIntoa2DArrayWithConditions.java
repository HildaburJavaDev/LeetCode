// task №2610

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<Integer>());
        int count = 1;
        for(int num : nums) {
            for (int i = 0; i < count; i++) {
                if (!answer.get(i).contains(num)) {
                    answer.get(i).add(num);
                    break;
                } else {
                        if (i == count - 1) {
                        answer.add(new ArrayList<Integer>());
                        answer.get(count).add(num);
                        count++;
                        break;
                        }
                    }
                }
            }
        return answer;
    }
}
