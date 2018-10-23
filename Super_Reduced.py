str1=raw_input()

list1=list(str1)
list2=[]
list2.append(list1[0])
for i in range(1,len(list1)):
    if(len(list2)==0):
        list2.append(list1[i])
    elif(list2[len(list2)-1]==list1[i]):
        list2.pop()
    else:
        list2.append(list1[i])

if(len(list2)==0):
    print 'Empty String'
else:
    print ''.join(list2)
