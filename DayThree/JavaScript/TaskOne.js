import random

firstNumber = 0;
secondNumber = 0;

for number in range(1,10):
	userInput = int(input("Enter a random number"))

	if userInput == firstNumber + secondNumber:
		print("")
print(userInput)