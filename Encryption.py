#!/bin/python

import sys


import math
s = raw_input().strip()
list1=list(s)
length=len(s)
#print length

rows=int(math.floor(math.pow(length,0.5)))
#print rows


columns=int(math.ceil(math.pow(length,0.5)))
#print columns

j=0
list2=[]
y=rows*columns-length
if(y<0):
    rows=rows+1
for i in range(rows):
    list2.append(list1[j:columns+j])
    j=j+columns

z=rows*columns-length
if(z>0):
    for i in range(z):
        list2[rows-1].append('')

#print list2
for j in range(columns):
    a=[]
    for i in range(rows):
        a.append(list2[i][j])
    print ''.join(a),
    
        


