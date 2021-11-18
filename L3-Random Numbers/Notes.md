# Unit 3 - Decision Structures

## [**Quiz Game**][quiz]

## Random Numbers

_How do I make random numbers?_  There's a class for that!

Then `Random` class of the `java.utils` package includes many methods to assist in creating random numbers. Random numbers are an excellent way to simulate many game-like objects. For example, a die is just a random number from 1 to 6. 

The one method we will primarily be working with is: 

* `nextInt(int n)` - returns a random integer from 0 to `n` but not including `n`

Example: 
* `nextInt(7)` will return a random integer from 0 to 6
* `nextInt(6) + 1` wil return a random integer from 1 to 6

To use the `Random` class, we need to create an object and call the method from above. 

Let's create a Math Quiz game. The user will be prompted with an option of choosing addition, subtraction, multiplication and division. After the user chooses and operation, they will be prompted with a problem to solve, then asked to provide an answer. After receiving an answer, the program will prompt whether the answer is correct or not. 

Create a new class called `Quiz` which will have 4 methods, each method to create a problem from each operation and assign the answer.

[quiz]:./src/QuizGame.java
