class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        def backtracking(index, curr):
            if index == len(nums):
                res.append(curr.copy())
                return
           
            curr.append(nums[index])
            backtracking(index+1,curr)
            curr.pop()
            while index +1 < len(nums) and nums[index] == nums[index+1]:
                index+=1
            backtracking(index+1, curr)
        backtracking(0, [])
        return res
            
        