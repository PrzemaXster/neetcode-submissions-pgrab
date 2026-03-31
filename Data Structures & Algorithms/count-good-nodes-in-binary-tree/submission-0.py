# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    goodCount = 0
    def goodNodes(self, root: TreeNode) -> int:
        maxNum = -101
        self.goodPath(root, maxNum)
        return self.goodCount

    def goodPath(self, current, maxNum) -> int:
        if current:
            if current.val >= maxNum:
                self.goodCount+=1
                maxNum = current.val
            self.goodPath(current.left, maxNum)
            self.goodPath(current.right, maxNum)
   