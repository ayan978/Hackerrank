if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    arr1 = set(arr)
    arr1.remove(max(arr1))
    
    arr2 = list(arr1)
    s_highest = arr2[0]
    
    for i in arr2:
        if i>s_highest:
            s_highest = i
            
    print(s_highest)
    
