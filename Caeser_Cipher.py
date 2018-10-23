#!/bin/python

import sys


n = int(raw_input().strip())
s = raw_input().strip()
k = int(raw_input().strip())
#s='middle-Outz'
#k=2
list1=[]
for i in range(len(s)):
    if((ord(s[i])>=65 and ord(s[i])<=90)):
        z = ord(s[i])+(k%26)
        if(z > 90):
            list1.append(chr(64+(z-90)))
        else:
            list1.append(chr(ord(s[i])+(k%26)))
        
    elif((ord(s[i])>=97 and ord(s[i])<=122)):
        z = ord(s[i])+(k%26)
        if(z > 122):
            list1.append(chr(96+(z-122)))
        else:
            list1.append(chr(ord(s[i])+(k%26)))
    else:
        list1.append(s[i])
print ''.join(list1)


