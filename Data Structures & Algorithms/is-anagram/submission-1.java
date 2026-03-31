class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountMapS = new HashMap<>();
        Map<Character, Integer> charCountMapT = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (charCountMapS.containsKey(sArray[i])) {
                charCountMapS.replace(sArray[i], charCountMapS.get(sArray[i]) + 1);
            } else {
                charCountMapS.put(sArray[i], 1);
            }
            if (charCountMapT.containsKey(tArray[i])) {
                charCountMapT.replace(tArray[i], charCountMapT.get(tArray[i]) + 1);
            } else {
                charCountMapT.put(tArray[i], 1);
            }
        }
        return charCountMapS.equals(charCountMapT);
    }
}
