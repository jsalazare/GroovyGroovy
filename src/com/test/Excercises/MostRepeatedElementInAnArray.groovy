package com.test.Excercises

class MostRepeatedElementInAnArray {



    //return the most repeated element in an array.
    static int getMostRepeatedElement (int [] A) {
        def hash = [:]

        int maxRepeatedNumber = Integer.MIN_VALUE
        int mostRepeatedValue = 0

        A.each {
            if (hash.containsKey(it)) {
                hash[it] = hash[it] + 1
                if (hash[it] > maxRepeatedNumber){
                    maxRepeatedNumber = hash[it]
                    mostRepeatedValue = it
                }
            } else {
                hash[it] = 1
                maxRepeatedNumber = 1
                mostRepeatedValue = it
            }
        }

        mostRepeatedValue
    }




    static void main(String[] args) {
        println getMostRepeatedElement([1,1,2,2,2,3] as int [])


    }

}