friends = ["Apple", "Orange", 5, 345.06, False, "Aakash", "Rohan"]

print(friends)
friends[0] = "Grapes" # Unlike Strings lists are mutable

print(friends[0])

friends.append("PARTH") # append add the word on last in the list
print(friends)

l1 =[1, 52, 5, 6, 56, 24, 36]
# l1.sort()
# print(l1)
# l1.reverse()
# print(l1)
# l1.insert(5, 255) # Insert 255 such that its index in the list is 5
value = l1.pop(3)
print(value)
print(l1)

l1.remove(52) # If you want remove some value in list the type list_name.remove
print(l1)