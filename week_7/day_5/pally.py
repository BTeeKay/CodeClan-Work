# test a string is a palindrome; given a string s, write a function that returns true if it
# is a palindrome or false otherwise

string1 = "catac"
string2 = "horse"
string3 = "thisisntfunuftnsisiht"

def is_palindrome(s):

    arr1 = []
    arr2 = []

    for i in range(len(s)):
        arr1.append(s[i])
        arr2.append(s[i])

    arr2.reverse()

    if arr1 == arr2:
        return True
    else:
        return False

# print(is_palindrome(string1))
# print(is_palindrome(string2))
# print(is_palindrome(string3))

myNewList = [1,1,2,2,3]
print(set(myNewList))
print(sum(set(myNewList)))
