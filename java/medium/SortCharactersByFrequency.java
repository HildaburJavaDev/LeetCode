// task №451

class Solution {
   public String frequencySort(String s) {
        Map<Character, Integer> str = new HashMap<>();
        for (char ch : s.toCharArray()) {
            str.put(ch, str.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        str.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue())) 
                .forEach(entry -> {
                    sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
                });

        return sb.toString();
    }
}
