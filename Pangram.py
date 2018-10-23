str1=raw_input()
list1=str1.split(' ')
str2=''.join(list1)
str3=str2.lower()
if(len(set(str3))<26):
    print 'not pangram'
else:
    print 'pangram'

