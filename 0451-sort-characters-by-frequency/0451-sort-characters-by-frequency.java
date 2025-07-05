import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(mp1.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}
