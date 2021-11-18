# Unit 3 - Decision Structures

## [**MovieTickets Sandbox**][sandbox]

## If Statements

Thus far, our programs have executed linearly. However, programs are able to branch, create many possible outcomes based on user input. In other words, programs can make decisions. 

[**Relational Operators**](https://www.tutorialspoint.com/java/java_relational_operators_examples.htm) allow programs to make decisions by comparing variables values. When you use these operators to make a comparison its called a `boolean expression` because these expressions evaluate to either `true` or `false`. 

Example: 
* `5 > 7`   returns `false`
* `19 <= 19` returns `true`
* `25 != 25` returns `false`

Keep in mind the [**Order of Precedence**](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html), which puts relational operators after arithmetic operators.
![](relational%20operators.png)

Examples of boolean expressions:
![](boolean%20expressions.png)

These expressions can be passed to `System.out.println()` and assigned to variables, but will only print `true` or `false`. 


[**If-Statements**](https://www.tutorialspoint.com/java/if_statement_in_java.htm) are the way computers make decisions. They are written as:

```
if(boolean expression){
    //code to be executed
}
``` 
The most important part of the if statement is the boolean expression. If it evaluates to true, then anything within the scope of the if-statement is executed. If the boolean expression is false, then flow of execution passes to the next statement after the if-statement.

Let's look at the following in the [**Movie Tickets**][movie]:

```java
import java.util.Scanner;

public class MovieTickets {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("How much money do you have?");
        double money = read.nextDouble();

        if(money >= 10){
            System.out.println("You can buy a ticket.");
        }

        if(money > 20){
            System.out.println("You can also buy popcorn.");
        }

        if(money < 10){
            System.out.println("You can't buy a ticket.");
        }

    }
}
```

Keep in mind that if-statements will execute linearly if their boolean-expressions are true. Let's explore this [**Sandbox**][sandbox] :

Let's look at a Grading program in the [**Grades**][grades]

## Nested If Statements

Another strategy for using If-statements is to nest them. **Nesting** means to put one if-statement inside another.

Let's edit the [**Grades**][grades] so it works appropriately.

### Flags

Flags are simple boolean variable. They can be used to signal an if-statement to execute.

Let's look at [**Smiley**][flags] :


[movie]:./src/MovieTickets.java
[grades]:./src/Grades.java
[flags]:./src/EmojiGUI.java
