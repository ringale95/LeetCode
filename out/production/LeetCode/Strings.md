# Know about Strings

 - String is an object and is not a primitive data type
 - Strings are immutable. Once a string object is created, its content cannot be changed.
 - Any operation that appears to modify a string actually creates a new string object with the modified content.

```agsl
String str = "Hello, world!";

```
- Here str is a reference which holds address where "Hello World" is stored in heap memory.
  - Heap is a memory where objects are dynamically allocated during program execution. 
> **_NOTE:_** All the objects are stored in heap and all the primitive types are stored in Stack
  - When you create a string object using the new keyword or by using string literals, the string object is allocated memory on the heap.
    -String literals are sequences of characters enclosed in double quotes (" ")
```agsl
String str = "Hi";
```
  - When you create a string using a string literal, Java first checks the string pool. If a string with the same content already exists in the string pool, Java returns a reference to that string instead of creating a new one. This is done to conserve memory and improve performance by avoiding the creation of duplicate string objects.
  - When you create a string object using the new keyword or by using string literals, the string object is allocated memory on the heap.
  
```agsl
String str1 = "Hello";
String str2 = "Hello"; // Since "Hello" already exists in the string pool, str2 will reference the same string object as str1

System.out.println(str1 == str2); // This will print true since str1 and str2 reference the same string object
System.out.println(st1.equals(str2)); // Prints true as point to same 
String str3 = str1 + ", world!"; // Concatenating strings using the + operator
System.out.println(str3); // This will print "Hello, world!"

```

## String Sequence and String Substring
- Sequence is not contiguous and substrings are contiguous.
- Substrings:
```agsl
String str = "Hello World";
String subString1 = str.substring(6); // "World"
or
String subString2 = str.substring(0, 5); // "Hello"

```

Using ASCII characters one can perform operations on characters:

Convert string to charArray:
```agsl
String str = "Hello";
char[] charArray = str.toCharArray();
```
```agsl
String str = "Hello";
char firstChar = str.charAt(0); // Retrieves the character 'H' at index 0
char thirdChar = str.charAt(2); // Retrieves the character 'l' at index 2

```