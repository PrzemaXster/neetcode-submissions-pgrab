class Solution {
    public static boolean isValid(String s) {
        List<Integer> bracketMemory = new LinkedList<Integer>();
        for (int i = 0; i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{') {
                bracketMemory.add((int) s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(bracketMemory.isEmpty() || bracketMemory.remove(bracketMemory.size()-1) + 1 != s.charAt(i)){
                    return false;
                }
            }else if(s.charAt(i) == ']'|| s.charAt(i) == '}'){
                if(bracketMemory.isEmpty() || bracketMemory.remove(bracketMemory.size()-1) + 2 != s.charAt(i)){
                    return false;
                }
            }else{
                return false;
            }
        }
        return bracketMemory.isEmpty();
    }
}
