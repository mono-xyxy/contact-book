public class JavaKeywords {
    public static void main(String[] args){
        //Using final ad int keyword.
        final int x = 10;
        //Using if and else keywords.
         if (x > 10){
            System.out.println("failed");
         }else{
            System.out.println("Succesful demonstration of keywords");
         }


    }
}
// what happens if we use variable name same as keyword?
//String this = "Hello world";

// Errors
// not  a statement
// need ;

/*
Java keyword list
boolean - Defines a variable that holds true or false
byte - Defines an 8 bit signed integer
char - Defines 18 bit unicode character
short - Defines a 16 bit signed integer
int - Defines a 32 bit signed integer
long - Defines a 64 bit signed integer
float - Defines a 32 bit floating point number
double - Defines a 64 bit floating point number
void - specifies that a method does not return any value

if - executes code when condition is true
else - Defines an alternative block when an if condition is false
switch - Selects one block of code when there are multiple options
case - defines individual branch in a switch statement
default - Defines a block executed when no case matches
for - starts a for loop
while - starts a while loop
do - starts a do- while loop
break - terminates nearest loop or switch
continue - skips to the next iteration of the loop
return - exits from a method and optionally returns a value

try - Defines a block of code to test for exceptions
catch - Defines a block to handle exceptions thrown by try
finally - Defines block that always executes after try and catch
throw - used to manually throw an exception
throws - Declares the exceptions that a method can throw
assert - tests assumptions during program execution during debugging

class - Declares a class
interface - Declares an interface 
extends - Indicates inheritance from a super class
implements - Indicates that a class implements an interface
new - creates new object
this - refers to the current object
super - refers to the super class of current object
abstract - Declares a class or method that must be implemented in sub class
final - Prevents inheritance , overriding , or  modification
static - Declares class level variables or methods 
sealed - restricts which class can extend given class
permits - Specifies the sub classes allowed to extend a sealed class 

public - Accesible from anywhere in the program
protected - Accesible within same package or subclasses
private - accesible only within the same class

package - defines a namespace for classes
import - Allows access to classes from other packages

synchronized - Defines critical sections that only one thread can access at a time
volatile - indicates that a variable may change asynchronously

transient - Excludes a variable from serialization
native - Specifies that a method is implemented n native (non java) code

 strictfp - ensures consistent floating point calculations across platforms.

 const - reserved for future use , not currently implemented.
 goto - reserved for future use , not currently implemented.

 literals
 true - Represents the boolean value true.
 false - represents the boolean value false.
 null - represents the absence of any reference value.
*/