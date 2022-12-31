import random
nc = random.randrange(100)
var1="-----------------------------------------------------------------------------------------------------------------------------"
var2="                      WELCOME TO THE GUESS THE NUMBER GAME              "
var3="-----------------------------------------------------------------------------------------------------------------------------"
print(var1.center(90))
print(var2.center(120))
print(var3.center(90))

np = int(input("Enter guessed number by computer: "))
while np != nc:
    if nc > np:
        print("Higher Number Please")
        np = int(input("Try Again: "))
    elif nc < np:
        print("Lower Number Please")
        np = int(input("Try Again: "))
else:
    print("Congratulations! You've guessed the number correct!")
    print("Computer no. :",nc)