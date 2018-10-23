#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    list1=[3,5]

    z=n//3
    #print z
    if(z==0):
        print -1
    else:
        list2=[]   
        for i in range(z,-1,-1):
            z=float((n-3*i))/5
            y=float((n-3*i))%5
            #print y
            if(y==0.0):        
                list2.append(i)
                list2.append(int(z))
                break
            else:
                continue
        #print list2
        if(len(list2)==0):
            print -1
        else:
            list3=[]
            list3.append(list1[0]*list2[0])
            list3.append(list1[1]*list2[1])
            #list3=[x*y for x,y in zip(list1,list2)]
            #print list3
            list4=[]
            list4.append('5'*list3[0]+'3'*list3[1])
            print list4[0]




