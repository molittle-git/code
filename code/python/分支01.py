import heapq

def knapsack(W, wt, val, n):
    pq = []
    maxVal = [0]
    maxValues = [[]]
    
    def push(index, currW, currVal, selected):
        if index == n or currW == W:
            if currVal > maxVal[0]:
                maxVal[0] = currVal
                maxValues[0] = selected[:]
            return
        # 不选择当前物品
        push(index + 1, currW, currVal, selected)
        # 选择当前物品
        if currW + wt[index] <= W:
            selected.append(index)
            push(index + 1, currW + wt[index], currVal + val[index], selected)
            selected.pop()
    
    push(0, 0, 0, [])
    return maxVal[0], maxValues[0]

W = 50
wt = [10, 20, 30]
val = [60, 100, 120]
n = len(wt)

print(knapsack(W, wt, val, n))