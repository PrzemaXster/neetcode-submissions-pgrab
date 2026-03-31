
# 1. buy and sell prices multiple times
# 2. once sold you cannot buy one until the next day
# 3. at most 1 neetcoin at a time
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        dp = {} # key=(i, buying) val=max_profit

        def dfs(i, buying):
            if i >= len(prices):
                return 0

            if (i, buying) in dp:
                return dp[(i, buying)]
            hold = dfs(i+ 1, buying)
            if buying:
                buy = dfs(i + 1, not buying) - prices[i]
                dp[(i, buying)] = max(buy, hold)
            else:
                sell = dfs(i + 2, not buying) + prices[i]
                dp[(i, buying)] = max(sell, hold)
            return dp[(i, buying)]

        return dfs(0, True)