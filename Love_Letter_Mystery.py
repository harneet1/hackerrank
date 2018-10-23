x=input()
for k in range(x):
    str1=raw_input()
    i=0
    j=len(str1)-1
    count=0
    list1=list(str1)
    while(i<=j):
        if(list1[i]==list1[j]):
            i=i+1
            j=j-1
        elif(ord(list1[i])<ord(list1[j])):
            z=(ord(list1[j])-ord(list1[i]))
            #print (chr(ord(list1[j])-z))
            list1.insert(j,(chr(ord(list1[j])-z)))
            del list1[j+1]
            
            count=count+z
            #print ''.join(list1)
        else:
            z=(ord(list1[i])-ord(list1[j]))
            list1.insert(i,(chr(ord(list1[i])-z)))
            del list1[i+1]
            
            count=count+z
            #print ''.join(list1)
    print count

