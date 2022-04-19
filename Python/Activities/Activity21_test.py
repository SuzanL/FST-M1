import pytest


#Sum of two numbers
def test_sum():
   num1 = 11
   num2 = 18
   sum = num1 + num2
   assert sum == 29

#Difference of two numbers
def test_diff():
    num1 = 91
    num2 = 4
    diff = num1 - num2
    assert diff == 86

#Product of two numbers
def test_multiplication():
    num1 =10
    num2 =90
    prod = num1 * num2
    assert prod == 900

#Quotient of two numbers
def test_division():
    num1=100
    num2=5
    div = num1/num2
    assert div == 20