class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = [-stone for stone in stones]
        heapq.heapify(stones)
        while len(stones) > 1:
            maxStone = heapq.heappop(stones)
            maxStone2 = heapq.heappop(stones)
            result = maxStone - maxStone2
            if result != 0:
                heapq.heappush(stones, maxStone - maxStone2)
        stones.append(0)
        return abs(stones[0])