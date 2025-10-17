#  To swap numbers using python
x = input("Enter x : ")
y = input("Enter y : ")

print("Before swapping : x = ",x,", y = ",y)

# swap using third variable

# temp = x
# x = y
# y = temp

# without using third variable

# x = x + y
# y = x - y
# x = x - y

#python special syntax

# x,y = y,x


# using XOR bitwise operator
x = x^y
y = x^y
x = x^y

print("After swapping : x = ",x,", y = ",y)
