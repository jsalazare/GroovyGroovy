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
            }
        }

        mostRepeatedValue
    }

    //optimize using an array instead of a hash.
    static int getMostRepeatedElement2 (int [] A) {
        def arr = new int [101]
        int maxRepeatedNumber = Integer.MIN_VALUE
        int mostRepeatedValue = 0

        A.each {
            if (arr[it]) {
                arr[it] = arr[it] + 1
            } else {
                arr[it] = 1
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxRepeatedNumber){
                maxRepeatedNumber = arr[i]
                mostRepeatedValue = i
            }
        }

        mostRepeatedValue
    }




    static void main(String[] args) {
        println getMostRepeatedElement2([1,2,3,4,4,20,5,100,100,100] as int [])


    }

}