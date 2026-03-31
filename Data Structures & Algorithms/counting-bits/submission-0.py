class Solution:
    def countBits(self, n: int) -> List[int]:
        res = []
        for i in range(n + 1):
            local = 0
            for j in range(i):
                if (1 << j) & i:
                    local += 1
            res.append(local)
        return res