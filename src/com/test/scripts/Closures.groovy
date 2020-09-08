package com.test.scripts


//closures are like executables block codes in groovy.

def str = "hello world"

def myClosure = {param -> println "hi, $str, and $param"} //you can create closure with aparams.

myClosure.call("hihi")

//method do not share the global scope
def method1 () {
    println "$str"
}

//method1()

//closures can be threat as objects.
def method2 (closure) {
    closure.call("groovy from method 2")
}

method2(myClosure)


//closures can also have return values.
def myReturnValueClosure = { a,b,c ->
    return a+b+c
}


println myReturnValueClosure(1,2,3)

def arr = [1,2,3,4]
def closure2 = {print it}
arr.each(closure2)
println ""
arr.each {print it}
println ""

def dictionary = ['one': 1, "two": 2, 3: 3, true: "potato", false: "tomato"]

println dictionary

println dictionary['true']
println dictionary[false]
println dictionary['one']
println dictionary["one"]
println dictionary[3]
println dictionary[100]