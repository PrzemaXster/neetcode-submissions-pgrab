class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        resultArr = list()
        candidates.sort()
        def backtrackSum(currArr : List[int], index : int, total):
            if total == target:
                resultArr.append(currArr.copy())
                return
            elif total > target or index == len(candidates):
                return
            currArr.append(candidates[index])
          
            backtrackSum(currArr, index+1, total + candidates[index])
            currArr.pop()
            while index + 1 < len(candidates) and candidates[index] == candidates[index+1]:
                index+=1
            backtrackSum(currArr, index + 1, total)
        backtrackSum([],0,0)
        return resultArr