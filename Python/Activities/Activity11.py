Fruits = {
    "Apple": 100,
    "Mango": 150,
    "Orange": 200,
    "grapes": 50,
    "cherry": 300
}
print(Fruits)

Check_fruit=input("Enter the Fruit Name:").lower()

if(Check_fruit in Fruits):
    print (Check_fruit ,"is available")
else:
    print (Check_fruit ,"is not available")