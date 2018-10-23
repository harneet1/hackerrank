# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys
T=input()
for i in range(T):
    N,M,S=map(int,raw_input().strip().split(' '))
    if(N==M and S==1):
        print N
        sys.exit()
    x=M%N+(S-1)
    if(x>N):
        print x%N
    elif(x==0):
        print 1
    else:
        print x


                

