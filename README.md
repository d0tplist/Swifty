# Swifty
Run Swift code on the JVM (A lot work in progress)

This work is based on Enkel Lang, but with a few of fixes.


The objetive of this proyect is to be able to run the basic syntax of the Swift lang directly
on the JVM, and yeah Kotlin looks very similar to Swift but is not the same.


So I hope to learn more and more of Swift at the same time I master java.


Usage:

Swift code:
``` swift
    
    class ForStatement {
        
        init(){
            for i in 3 ... 10 {
                print(i)
            }
            
        }
        
    }
    

```
The keyword 'class' is optional* and the init method is executed inmediatly working as the main(String[] args) method in Java (for the moment)

``` java
java -jar swifty.jar ForStatement.swift 
java ForStatement
```

And this must be the result!

```
3
4
5
6
7
8
9
10
```

Actually I don't know if I'll add support to Structs (it's not hard really just a copy constructor)

Hope Apple do not sue me c:
