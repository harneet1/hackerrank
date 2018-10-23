str1=raw_input()
str2=raw_input()

list1=[0]*26
list2=[0]*26

for i in range(len(str1)):
    x=ord(str1[i])-ord('a')
    list1[x]=list1[x]+1

for i in range(len(str2)):
    x=ord(str2[i])-ord('a')
    list2[x]=list2[x]+1

count=0
for i in range(len(list1)):
    if(list1[i]==list2[i]):
        continue
    else:
        count=count+abs(list1[i]-list2[i])
print count

