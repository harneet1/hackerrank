def check(str1,str2):
    list1=list(set(str1))
    list2=list(set(str2))
    for i in range(len(list1)):
        if(list1[i] in list2):
            return 'YES'
    return 'NO'
x=input()
for i in range(x):
    str1=raw_input()
    str2=raw_input()
    z=check(str1,str2)
    print z

        

