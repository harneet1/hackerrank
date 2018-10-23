#!/bin/python

import sys

def Toys(prices, k):
    # Complete this function
    prices.sort()
    count = 0
    for i in range(len(prices)):
        if prices[i] < k:
            k = k - prices[i]
            count = count+1
    return count
            
        

if __name__ == "__main__":
    n, k = raw_input().strip().split(' ')
    n, k = [int(n), int(k)]
    prices = map(int, raw_input().strip().split(' '))
    result = Toys(prices, k)
    print result

