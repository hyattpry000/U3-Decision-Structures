# Unit 3 - Decision Structures

## Logical Operators

[**Logical Operators**](https://www.tutorialspoint.com/java/java_logical_operators_examples.htm) combines boolean expressions using the **AND**(`&&`), **OR**(`||`) or **NOT**(`!`). These larger expressions, called [**compound boolean expressions**](), also evaluate to either `true` or `false` depending on whether the boolean expressions are `true` or `false`. 

### AND

Let's look at this simple logical statement: 

_If you are 16 and have your license, then you can drive._

The two boolean expressions follow the **if** and are coded `age > 16` and `license = true`. There are 4 possible conditions to this example: 

* you are not older than 16 and you do not have your license
* you are not older than 16 and you do have your license
* you are older than 16 and you don't have your license
* you are older than 16 and you have your license. 

_Which one of these conditions leads to the conclusion that you can drive?_

Let's assume that the user will enter their age and whether they have a license to drive. Let's look at these conditions in code. 

<table>
    <tr>
        <th></th>
        <th>`age > 16`</th>
        <th>`license == true`</th>
        <th>`(age > 16) && (license = true)`</th>
    </tr>
    <tr>
        <td>#1</td>
        <td>false</td>
        <td>false</td>
        <td>false</td>     
    </tr> 
    <tr>
        <td>#2</td>
        <td>false</td>
        <td>true</td>
        <td>false</td> 
    </tr>
    <tr>
        <td>#3</td>
        <td>true</td>
        <td>false</td>
        <td>false</td> 
    </tr>
    <tr>
        <td>#4</td>
        <td>true</td>
        <td>true</td>
        <td>true</td> 
    </tr>
</table>

This is called a [**Truth Table**](https://www.cs.utah.edu/~germain/PPS/Topics/truth_tables_and_logic.html) where you logically decide all the possible conditions and outcomes for the compound boolean expression. This truth table illustrates the logic of **AND**. 

_For what conditions is the **AND** operator true? false?_

Let's see how this works in code:

```java
import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //GET INPUT
        System.out.print("How old are you?");
        int age = read.nextInt();
        System.out.print("Do you have a license? Answer true or false.");
        boolean license = read.nextBoolean();
        
        //DETERMINE LOGIC
        if((age > 16) && (license == true)){
            System.out.println("You can drive");   
        }
        else{
            System.out.println("You can't drive.");
        }
    }
}
``` 
Oftentimes, programmers look for ways to shorten the code and make it more readable. `license == true` is redundant code and can be shortened to just `license` since the value is either true or false. You could also remove the brackets in the if-statement since there is only one statement after the `if` and `else`. If we had multiple statements, we would HAVE to use brackets. 

Let's look at [**PizzaCost**][pizza]

### OR

Let's look at another logical statement:

_You must take CS 2 or AP Computer Science in order to take CS 3._

Let's break this down into boolean expressions and create a truth table. Replace the `...` with what you think the **OR** statement evaluates to.

<table>
    <tr>
        <th></th>
        <th>`cs2`</th>
        <th>`ap`</th>
        <th>`cs2 || ap`</th>
    </tr>
    <tr>
        <td>#1</td>
        <td>false</td>
        <td>false</td>
        <td>...</td>     
    </tr> 
    <tr>
        <td>#2</td>
        <td>false</td>
        <td>true</td>
        <td>...</td> 
    </tr>
    <tr>
        <td>#3</td>
        <td>true</td>
        <td>false</td>
        <td>...</td> 
    </tr>
    <tr>
        <td>#4</td>
        <td>true</td>
        <td>true</td>
        <td>...</td> 
    </tr>
</table>

_For what conditions is the **OR** operator true? false?_

Again, let's see it in code: 

```java
import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //GET INPUT
        System.out.print("Did you take CS 2? Answer true or false");
        boolean cs2 = read.nextBoolean();
        System.out.print("Did you take AP Comp Sci? Answer true or false.");
        boolean ap = read.nextBoolean();
        
        //DETERMINE LOGIC
        if(cs2 || ap)
            System.out.println("You can take CS 3.");   
        else
            System.out.println("You can't take CS 3.");
    }
}
``` 
Let's look at [**GameOver**][gameover]

### NOT

Lastly the **NOT** operator just switches the truth value. So if a boolean is true, it evaluates to false and vice versa. 

_You must have a degree and 5 years experience to get a job._

Let's look at this in code:

```java
import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //GET INPUT
        System.out.print("Do you have a degree? Answer true or false");
        boolean degree = read.nextBoolean();
        System.out.print("How many years of experience?");
        int exp = read.nextInt();
        
        //DETERMINE LOGIC
        if(!(degree && (exp >= 5)))
            System.out.println("You can't get a job.");   
        else
            System.out.println("You can get a job.");
    }
}
```
Notice that the **AND** statement is enclosed in parenthesis, and the **NOT** operator is outside. This is because the **NOT** operator has a higher order of precedence. **NOT** works just the same as a negative in math. 

`(-3+4) != -(3+4)`

`(!x + y) != !(x + y)`

[pizza]:./src/PizzaCost.java
[gameover]:./src/GameOver.java