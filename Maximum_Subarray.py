# Enter your code here. Read input from STDIN. Print output to STDOUT
def contigous(list1):
    count=0
    for i in range(len(list1)):
        if(list1[i]<0):
            count=count+1
        else:
            break
    if(count==len(list1)):
        return max(list1)
    else:    
        max_so_far = 0
        max_ending_here = 0

        for i in range(0, len(list1),1):
            max_ending_here = max_ending_here + list1[i]
            if max_ending_here < 0:
                max_ending_here = 0
            elif (max_so_far < max_ending_here):
                max_so_far = max_ending_here
        return max_so_far
def noncontigous(list1):
    count=0
    for i in range(len(list1)):
        if(list1[i]<0):
            count=count+1
        else:
            break
    if(count==len(list1)):
        return max(list1)    
    else:
        sum1=0
        for i in range(len(list1)):
            if(list1[i]>0):
                sum1=sum1+list1[i]
        return sum1

n=input()
for i in range(n):
    m=input()
    list1=map(int,raw_input().strip().split())
    print contigous(list1),
    print noncontigous(list1)
    
