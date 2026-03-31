class Solution:
    def rob(self, nums: List[int]) -> int:

        def rob1(nums):
            rob1, rob2 = 0,0

            for num in nums:
                temp = max(rob1 + num, rob2)
                rob1 = rob2
                rob2 = temp
            return rob2

        return max(nums[0],rob1(nums[1:]), rob1(nums[:-1]))

