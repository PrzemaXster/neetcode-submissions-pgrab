class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        # temporarily add edge to a graph
        # run dfs to check if a cycle exists
        # if dfs revisits a node (not coming form its parent) a cycle is formed
        # so the edge is the answer
        
        n = len(edges)
        adj = [[] for _ in range(n+1)]
        def cycleFound(node, par):
            if visit[node]:
                return True
                
            visit[node] = True
            for nei in adj[node]:
                if nei == par:
                    continue
                if cycleFound(nei, node):
                    return True
            return False
            
        for u, v in edges:
            adj[u].append(v)
            adj[v].append(u)
            visit = [False] * (n+1)
            if cycleFound(u, -1):
                return [u, v]
        return []