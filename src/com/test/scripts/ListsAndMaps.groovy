package com.test.scripts


def myList = [1,2,3,4,5]


println myList.add(6)
println myList.find {item -> item == 100}
println myList.findAll {item -> item > 3}
println myList.any {item -> item > 2}
println myList.every {item -> item > 1} //return true if all elements meet the condition
println myList.collect {item -> item * 2}

println myList


def myMap = ['one': 1, 'two':2 , 'three': 3]

myMap.each {print "$it, "}