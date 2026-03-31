class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountMapS = new HashMap<>();
        Map<Character, Integer> charCountMapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charCountMapS.containsKey(s.charAt(i))) {
                charCountMapS.replace(s.charAt(i), charCountMapS.get(s.charAt(i))+ 1);
            } else {
                charCountMapS.put(s.charAt(i), 1);
            }
            if (charCountMapT.containsKey(t.charAt(i))) {
                charCountMapT.replace(t.charAt(i), charCountMapT.get(t.charAt(i)) + 1);
            } else {
                charCountMapT.put(t.charAt(i), 1);
            }
        }
        return charCountMapS.equals(charCountMapT);
    }
}
