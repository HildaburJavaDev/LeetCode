// task № 1431

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int cur : candies) {
            max = Math.max(max, cur);
        }
        List<Boolean> answer = new ArrayList<>();
        for (int cur : candies) {
            answer.add(cur + extraCandies >= max ? true : false);
        }
        return answer;
    }
}
