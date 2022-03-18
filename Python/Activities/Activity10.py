Tuple1=tuple(input("enter the numbers:").split(","))
print("Entered values are :", Tuple1)
print("elements that are divisible by 5 are :")
for num in Tuple1:
    if (int(num)%5 == 0):
        print (num)