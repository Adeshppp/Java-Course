jshell is java shell introduced in java 9.

jshell does not need to have all supporting functionality to run particular line of code in java. for example if you want to print a "Hello world!"

![Screenshot 2025-01-13 at 11 23 22 AM](https://github.com/user-attachments/assets/b4397928-3a10-49f4-bf19-b1c5c3d6fcb7)

Data types:

1. Primitive : 
Integer => byte (1 bytes), short (2 bytes), int (4 bytes), long (8 bytes)
Float => float(4 bytes), double(default 8 bytes)
Character => char (2 bytes)
Boolean => boolean (true or false)
2. Non-primitive :
String
Array
Object

 
Stack and Heap:

Stack is a memory area where local variables are stored. It is a LIFO (Last In First Out)
Heap is a memory area where objects are stored.

String: strings in Java are immutable. This means that once a string object is created, its contents cannot be changed.

Mutable string : can be change (String buffer and String builder)
Immutable string : can't be change

this and super method: 
this() calls constructor of the same class.
super() calls constructor of the parent class and this method stays there in every constructor by default. every class in java is a child class of Object class. 

Multple inheritence is not supported in JAVA.
Polymorphism: Many Behaviour
1. Compile time polymorphism (early binding) : Overloading : same method name with different signature
2. Run time polymorphism (late binding) : Overriding : parent and child class has same method


final Keyword:
1. final variable : can't be change
2. final method : can't be override
3. final class : can't be extend

Object class :

Every class in java extends Object class. 

toString():
Object class has a method called toString(), which returns some hex code by following some pattern like below

className@hexCodeOfClass

so by providing a implementation to toString methiod in a class we can make it return some valuable information about class. and then if we try top print obj then there will be some valuable information about a class.


equals():
Object class has a method called equals(), which returns boolean value by comparing 2 objects.
what if we want to check whether 2 objects has same values in it or not.

we can implement equals method aby giving it a implementation.

it's recommended to not provide implementation to toString(), hashCode() and equals() methods manually, we can use IDE to implement, which provides multiple checks.



Abstract keyword:
we can not create a object of abstract class.
child class should provide implementation to abstract methods.
abstract class can have abstract or concrete methods in it.


Inner class:

In Java only inner class can be static.

Anonymous class:
When we know that there is concreate or abstract class which is only be used once then in that situation we can use anonymous class.

 Interface:
 each methodd in the interface is abstract and public. we dont need to explicitly declare it as abstract and public.
 each variable in interface is static and final, so we should assign a value there itself.
 at the time of accessing or calling those varianbles we can use interface name as a reference like A.age;
 multiple imnheritence is possible by using interfaces.
we can not instantiate the interface so there is no space for a interface in a heap memory thats why we need to call any declared variable in it by using interface name reference.


calss -> class : extends
interface -> class : implements
interface -> interface : extends



Enumerator:

Enumaerator is used to declare constants. which is known as a object of enum class.
thats why if we declare any value in () brackets we need to declare a private constructir, we can also declare normal and parameterized constructor in enum.

Annotations:
Annotations are used to provide additional information about a class, method, variable etc. to the compiler, so we can get to know if there is any logic bugs in a code.

class level annotation:
@Deprecated

method level annotation:
@FunctionalInterface


Types of Interfaces in java:

1. Normal Interface
2. Marker Interface (blank interfcae) : may be for serialisation purpose
3. Functional Interface : SAM (Single Abstract Method)

Functional Interface (Single Abstract Method)

Lambda expression only works with functional interfaces


## Errors:
1. Compile time Errors
2. Run time Errors (Exceptions)
3. Logical Errors


Runtime errors/ exceptions can be handled by using try catch block.



### Input from user:
1. BufferedReader
2. Scanner

### Finally block:
finally block is used to perform some operation which is independent of try and catch block. it is used to close the resources.

## Threads:
Thread class implements Runnable interface which has run() method.
so whenever we want to implement a thread we can do it by 2 ways

1. Thread class
2. Runnable interface

### Thread class:
Thread class is used to create a thread. it has 2 methods
1. start() : start the thread
2. run() : we need to priovide implementation to the run method.

What if we want to extend another class and thread class at the same time, as in multiple inheritence is not allowed in java?
In that case we can use Runnable interface.


Runnable interface is functional interface so we can achieve threading by using lambda expression as well.

## Race Condition:

Race condition occures when 2 different threads try to change the variable at the same time and results in unexpected behaviour.
to avoid that we can declare the function as synchronized, which makes that particular function to be synchronized means allows only one thread to execute at a time.

also we can use join method on threads if we want to main thread to wait until threads finish executing.

Thread states:
1. New 
2. Runnable
3. Running
4. Waiting
5. Dead

### forEaach method of List interface
for each method is used to iterate over the list and it belongs to Iterable interface and takes Consumer interface type argument. which is Functional interface and has accept() method as an abstract method.

Stream API:

Stream can be only use once.
stream methods:
1. filter(n->n%2==0) : Predicate<T> FI : test(T)
2. map(n->n/2) : Function<T,R> FI : apply(T)
3. reduce(valueToStartWith, Operation)  : reduce(0,(c,e)->c+e);
4. sorted();


## LVTI : Local Variable Type Inference
in java 10, instead of using type while declaring a variable we can use 'var' keyword.
var only applicable for local variables means variables inside methods.
it is mandetory to assign a value to var variable.
Var keyword is not allowed at instance level. means inside a class and outside of method.

## Sealed classes
Sealed classes/interfaces are used to restrict the subclassing/subinterfacing of a class. 

### Final classes: any class can not inherite final class
### Abstract classes : any class can inherite abstract class

### What if we want to allow only few classes to inherite a base class?
In that case we can use sealed classes.
Sealed classes are used to restrict the subclassing/subinterfacing of a class/interface.
child class who is inheriting a seales class should have one of the following keyword:
1. sealed
2. non-sealed
3. final

sealed class should have sealed keyword and class names to which it wants to give access to inherite that class followed by permits keyword.
sealed child class should have a subclass. 
non-sealed class may or may not have normal child class.
final class can not have child class.

likewise for interfaces except that interfaces can not be declared as final.