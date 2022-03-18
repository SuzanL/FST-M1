# Calculate the sum of numbers from 0 to 10

def Sum(num):
  if num:
    return num + Sum(num-1)
  else:
    return 0

result = Sum(10)
 
print(result)