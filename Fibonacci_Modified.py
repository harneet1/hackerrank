# Enter your code here. Read input from STDIN. Print output to STDOUT
a,b,n=map(int,raw_input().split(' '))


def mod_fib(x,y,n):
    list1=[]
    list1.append(x)
    list1.append(y)
    for i in range(2,n):
        z=list1[i-1]*list1[i-1]+list1[i-2]
        list1.append(z)
    return list1[n-1]
x=mod_fib(a,b,n)
print x

