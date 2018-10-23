#!/bin/python

import math
import os
import random
import re
import sys

# Complete the nonDivisibleSubset function below.
def nonDivisibleSubset(k, S):
    count = [0]*k
    for i in range(len(S)):
        count[S[i]%k] = count[S[i]%k] + 1
        
    num = min(count[0],1)
    
    for i in range(1, k//2 + 1):
        if(i != k-i):
            num = num + max(count[i], count[k-i])
    if(k%2 == 0):
        num = num + 1
    return num
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = raw_input().split()

    n = int(nk[0])

    k = int(nk[1])

    S = map(int, raw_input().rstrip().split())

    result = nonDivisibleSubset(k, S)

    fptr.write(str(result) + '\n')

    fptr.close()

