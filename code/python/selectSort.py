dig=input("输入数组:").split()
def selectSort(dig):
    for i in range(len(dig)-1):
        minindex=i
        for j in range(i+1,len(dig)):
            if dig[i]>dig[j]:
                minindex=j
        if i!=minindex:
             dig[i],dig[minindex]=dig[minindex],dig[i]
    return dig
dig2=selectSort(dig)
print(dig2)