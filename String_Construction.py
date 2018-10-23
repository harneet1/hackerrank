#!/bin/python

import sys


n=input()
for i in range(n):
    str1=raw_input()
    list1=list(str1)
    list2=[]
    count=0
    for i in range(len(list1)):
        if(list1[i] not in list2):
            list2.append(list1[i])
            count=count+1
        else:
            continue
    print count


