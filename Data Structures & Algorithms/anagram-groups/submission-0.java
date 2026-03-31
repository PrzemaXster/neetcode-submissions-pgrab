class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        List<Map<Character, Integer>> frequencyMaps = new LinkedList<>();
        List<List<String>> result = new LinkedList<>();
        for (String str : strs) {
            boolean found = false;
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < frequencyMaps.size(); i++) {
                if(frequencyMaps.get(i).equals(frequencyMap)){
                    result.get(i).add(str);
                    found = true;
                }
            }
            if(!found){
                frequencyMaps.add(frequencyMap);
                List<String> resultElement = new LinkedList<>();
                resultElement.add(str);
                result.add(resultElement);
            }
        }
        return result;
    }
}
