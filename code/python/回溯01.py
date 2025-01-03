def knapsack(W, wt, val, n):
    maxVal = 0
    selected_items = []

    def backtrack(index, currW, currVal, selected):
        nonlocal maxVal, selected_items
        # 如果已经考虑完所有物品，或者当前重量已经超过背包容量
        if index == n or currW == W:
            if currVal > maxVal:
                maxVal = currVal
                selected_items = selected[:]
            return

        # 不选择当前物品
        backtrack(index + 1, currW, currVal, selected)

        # 选择当前物品，前提是加上当前物品不超过背包容量
        if currW + wt[index] <= W:
            selected.append(index)
            backtrack(index + 1, currW + wt[index], currVal + val[index], selected)
            selected.pop()  # 回溯，移除当前物品

    backtrack(0, 0, 0, [])
    return maxVal, selected_items

# 背包容量
W = 50
# 物品重量
wt = [10, 20, 30]
# 物品价值
val = [60, 100, 120]
# 物品数量
n = len(wt)

max_value, items = knapsack(W, wt, val, n)
print("最大价值为:", max_value)
print("选择的物品索引为:", items)