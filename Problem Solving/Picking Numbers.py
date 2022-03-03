import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    # Write your code here
    maximum = 0
    for i in a:
        c1 = a.count(i)
        c2 = a.count(i-1)
        c3 = c1 + c2
        
        if c3 > maximum:
            maximum = c3
            
    return maximum
        

if __name__ == '__main__':
    
    n = int(input())
    arr = [int(i) for i in input().split()]
    print(pickingNumbers(arr))
    
