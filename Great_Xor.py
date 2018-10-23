#!/bin/python

import sys
import math
def theGreatXor(x):
    str1 = bin(x)[2:]
    count = math.pow(2, len(str1)) - 1
    return int(count)-x

q = int(raw_input().strip())
for a0 in xrange(q):
    x = long(raw_input().strip())
    result = theGreatXor(x)
    print(result)


