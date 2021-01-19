package com.js.groovy

//LIST SHENANIGANS
LinkedList l = [1, 2, 3]
println l
println l.class

l << 4
println l

l = l + [5, 6, 7]
println l

println l - [3, 5]

l.each { print it }
l.reverseEach { print it }
//l.eachPermutation {println it}

//SET SHENANIGANS
v = ['java', 'js', 'python', 'js'] as Set
println v
println v.class

//MAP SHENANIGANS
m = [name: 'Tim', surname: 'Buchalka', hotness: 10]
println m
println m.getClass()

m.each {
    k, v ->
        println "${k}: ${v}"
}

println m.name
println m['name']
println m.get('name')

m.country = 'Australia'

println m