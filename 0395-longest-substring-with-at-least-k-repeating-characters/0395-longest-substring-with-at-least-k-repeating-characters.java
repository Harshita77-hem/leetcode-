
class Solution {
    public int longestSubstring(String s, int k) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                boolean valid = true;

                for (int freq : map.values()) {
                    if (freq < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    count = Math.max(count, j - i + 1);
                }
            }
        }

        return count;
    }
}