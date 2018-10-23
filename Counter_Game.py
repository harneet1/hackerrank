# Enter your code here. Read input from STDIN. Print output to STDOUT
t=input()
#counter=6
list2=['Louise','Richard']

for i in range(t):
    counter=input()
    z=list2[0]
    k=1
    while(counter!=1):
        str1=bin(counter)
        str1=str1[2:]
        list1=list(str1)
        y=len(list1)-1

        if(list1[0]=='1' and list1.count('0')==y):
            x=counter/2
            counter=counter-x
            if(counter==1):
                print z
        else:
            x=pow(2,y)
            #print counter
            counter=counter-x
            if(counter==1):
                print z
        z=list2[k%2]
        k=k+1
