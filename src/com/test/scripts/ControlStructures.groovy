package com.test.scripts


def empty = ""

if (!empty){
    println "emtpy is false"
}

def nullVariable = null

if (!nullVariable){
    println "variable is null"
}



def arr = [1,2,3]

for(num in arr) {
    print num
}

println ""

arr.each {print it}

println ""


def nullFoo = null
def i = 0
while (!nullFoo) {
    print ", iteration $i"
    if (i == 5) {
        nullFoo = "not null anymore"
    }
    i++
}

println ""

def number = 10
switch (number) {
    case 0:
        println "case 0"
        break
    case 1:
        println "case 1"
        break

    default:
        println "default case"
        break
}