# ADT : Abstract Data Type

When we have a type where we can perform some operations we call them Abstract.
example of ADT is queue data structure:
> concept: First In First Out

when we have a concept and associate operations along with data then it is called as Abstract Data Type.

## Array

###  Best case:
1. Searching operation

## Algorithms

Task : Searching an element in sorted array

1. Linear search : look for an element by traversing over all elements from start to end
2. Binary search : Divide and conquer (for each step we are removing half array from consideration)

In both of these approaches, how to understand which one is efficient?\
Time complexity

## Time complexity
Time Complexity is a measure of how the running time of an algorithm increases with the size of the input data.
to understand time complexity we use Big O Notation.

### Big O Notations
1. O(1) : Constant Time
2. O(log n) : Logrithmic Time
3. O(n) : Linear Time
4. O(n log n) : Linearithmic Time
5. O(n^2) : Quadratic Time
6. O(2^n) : Exponential Time
7. O(n!) : Factorial Time


   ![Image](https://github.com/user-attachments/assets/34ae37ca-1782-4992-91a8-3cb612752e5b)


## Famous Array Sorting Techniques

1. Bubble Sort O(n^2) : compares each element with all elements and swap
2. Selection Sort O(n^2) : Finds max or min number and keep it at the end of unsorted array
3. Insertion Sort O(n^2)
4. Quick Sort (O(n logn) - O(n^2)) : Divide and Conquer
5. Merge Sort



# LinkedList

### LinkedList vs Array
1. Linkedlist is expandable unlike array.
2. Linkedlist is slower than array as Arrays works with indexes.

###  Best case:
1. Insertion operation

## Stack : Abstract Data Type

LIFO (Last In First Out)

Features --> Provided Functions

add --> push(data)
delete --> pop()
find --> peak()

example: book stack


## Queue

FIFO (FIrst In First Out)

insert --> enqueue(data)
remove --> dequeue()


## Tree : Abstract Data Type

Tree has below elments associated with it:
1. Nodes
   1. Leaf Nodes : Nodes with no child nodes (can have multiple leaf nodes)
   2. Root Node : Root of a tree (where traversal starts)
2. Edges

### Binary Tree :
1. Strict Binary Tree : Each node should have 2 or no child nodes.
2. Full Binary Tree : All leaf nodes should be on same level.
3. Complete Binary Tree : All leaf nodes should be on l level or l-1 level

Concepts :
1. Height : steps from current node to farthest leaf node
2. Depth : steps from root node to current node

### Tree Traversal 
1. Inorder Traversal : Left -> Root -> Right : Gives sorted values
2. Preorder Traversal : Root -> Left -> Right
3. Postorder Traversal : Left -> Right -> Root
