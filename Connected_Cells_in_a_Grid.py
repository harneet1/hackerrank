#!/bin/python

import math
import os
import random
import re
import sys        
    
def dfs(matrix, i, j, visited):
    
    list1 = []
    list1.append((i,j))
    list2 = []
    list2.append(1)
    
    rowNbr = [-1, -1, -1,  0, 0,  1, 1, 1]
    colNbr = [-1,  0,  1, -1, 1, -1, 0, 1]
    
    count = 0
    copy = [row[:] for row in visited]
    while(len(list1) != 0):
        a,b = list1[len(list1)-1]
        #print list1
        i,j = list1.pop();
        #count = count + 1
        visited[i][j] = True
        
        for k in range(8):
            if((i + rowNbr[k]) >= 0 and (i + rowNbr[k]) < len(matrix) and (j + colNbr[k]) >= 0 and (j + colNbr[k]) < len(matrix[0]) and visited[i + rowNbr[k]][j + colNbr[k]] == False and matrix[i + rowNbr[k]][j + colNbr[k]] == 1):
                list1.append((i + rowNbr[k], j + colNbr[k]))
                #list2.append(1)
    
    #copy = [row[:] for row in visited]
    for i in range(len(copy)):
        for j in range(len(copy[0])):
            if(copy[i][j] != visited[i][j]):
                count = count + 1
    #print copy
    #print visited
    return count
    
def connectedCell(matrix):
    maximum = 0
    flag = 0
    visited = [[False for j in range(len(matrix[0]))]for i in range(len(matrix))]
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if(matrix[i][j] == 1 and visited[i][j] == False):
                count = dfs(matrix, i ,j, visited)
                flag = 1
            if(flag == 1):                
                if(count > maximum):
                    maximum = count
    return maximum
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(raw_input())

    m = int(raw_input())

    matrix = []

    for _ in xrange(n):
        matrix.append(map(int, raw_input().rstrip().split()))

    result = connectedCell(matrix)

    fptr.write(str(result) + '\n')

    fptr.close()

