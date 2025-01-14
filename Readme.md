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

