class Solution {
    public boolean hasDuplicate(int[] nums) {
        var intSet =  IntStream.of( nums ).boxed().collect(Collectors.toSet());
        if(intSet.size() < nums.length){
            return true;
        }
        return false;
    }
}