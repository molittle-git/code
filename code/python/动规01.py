def knapsack(W, wt, val, n):
    dp = [[0 for x in range(W + 1)] for x in range(n + 1)]
    
    for i in range(1, n + 1):
        for w in range(1, W + 1):
            if wt[i-1] <= w:
                dp[i][w] = max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w])
            else:
                dp[i][w] = dp[i-1][w]
                
    return dp[n][W]

# 背包容量
W = 50
# 物品重量
wt = [10, 20, 30]
# 物品价值
val = [60, 100, 120]
# 物品数量
n = len(wt)

print(knapsack(W, wt, val, n))