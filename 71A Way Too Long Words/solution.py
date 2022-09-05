threshold = 10
numWords = int(input())


for i in range(numWords):
    inp = input()
    l = len(inp)
    l1 = list(inp)
    if(l<=10):
        print(inp)
    else:
        print(l1[0]+str(l-2)+l1[l-1])