package com.js.groovy
//Closures are equivalent oj Java's Lambdas

//clouser without parameter
c = {
    println("I'm Closure without parameter!")
}
c.call()

isItEven = { n -> // n=2 this sets default value
    println("I'm Closure with parameter!")
    val = n % 2 == 0
    println("Is ${n} even?: ${val}")
}
isItEven.call(2)

//forEach from java
4.times {n -> println n}
4.times {print it}
