list1=[1,2,3,4,5,6,7,8,9,10]
list2=[11,12,13,14,15,16,17,18,19,20]
list3=[]
for num in list1:
    if(num%2 != 0):
        list3.append(num)
for num in list2:
    if(num%2 == 0):
        list3.append(num)
print("List 3 values are: ",list3)