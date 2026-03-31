class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        l = 0
        r = len(matrix[0])
        t = 0
        b = len(matrix)
        res = []
        while t < b and l < r:
            # get every i in the top row
            for i in range(l, r):
                res.append(matrix[t][i])
            t += 1

            # get every i in the right col
            for i in range(t,b):
                res.append(matrix[i][r - 1])
            r -= 1

            if not (l < r and t < b):
                break
            
            for i in range(r - 1, l - 1, -1):
                res.append(matrix[b - 1][i])
            b -= 1

            # get every i in the left col
            for i in range(b - 1, t - 1, -1):
                res.append(matrix[i][l])
            l += 1
        return res


