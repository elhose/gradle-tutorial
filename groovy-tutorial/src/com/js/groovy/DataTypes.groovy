package com.js.groovy

//defining a variable (derived type from what is supplied)
def a = 10
println a.byteValue()
println a.class // variables are wrapped in object

//defining a string
s = 'Stranger'
println('Hello ' + s)

//string which can reference variables, like in Angular, except it uses `` instead of ""
introduction = 'My name is'
artist ='Slim Shady'
println("${introduction} ${artist}")

multiLineString  = '''
Multi
Line
String
Which
Is
Awesome
'''
println(multiLineString)

//instant pattern evaluating
nameDotSurnamePattern = /\w+\.\w+/
println 'name.surname' ==~ nameDotSurnamePattern

