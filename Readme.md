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