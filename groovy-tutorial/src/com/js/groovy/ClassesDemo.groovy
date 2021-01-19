package com.js.groovy

//change manually the name of class, because if it is the same as class name, it will throw an error!
class Patient {
    def firstName,lastName,age

//    getters and setters are generated automatically
//    overwriting setter for age
    void setAge(int age) {
        //this is not language for elderly people
        if (age > 30) this.age = 100
        else this.age = age
    }
    static void display(){
        println("I'm static method!")
    }
}

p = new Patient(firstName: 'John', lastName: 'Doe', age: 25)
println ("${p.firstName} ${p.lastName} ${p.age}")

p.setAge(67)
println ("${p.firstName} ${p.lastName} ${p.age}")

Patient.display()