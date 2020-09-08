package com.test.demo


//constructors are automatically created bt groovy.
@groovy.transform.ToString
class Person {


    //Getters and setters are automatically created by groovy
    String name
    int age
    //all properties in a class body are private by default.


    void sayHello (){
        println "hello"
    }
}
