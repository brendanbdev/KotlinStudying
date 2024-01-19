package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  ANY, ALL, NONE - These functions check the existence of collection elements that match a given
//  predicate.

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    println("Numbers: $numbers")

//------------------------------------------------------------------------------------------------------
//  ANY - Function 'any' returns 'true' if the collection contains at least one element that matches
//  the given predicate.
    println("\nANY: ")

    // Checks if there are negative elements.
    val anyNegative = numbers.any { it < 0 }

    // Checks if there are elements greater than 6.
    val anyGT6 = numbers.any { it > 6 }

    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

//------------------------------------------------------------------------------------------------------
//  ALL - Function 'all' returns 'true' if all elements in collection match the given predicate.
    println("\nALL: ")

    // 2. Checks whether all elements are even.
    val allEven = numbers.all { it % 2 == 0 }

    // 3. Checks whether all elements are less than 6.
    val allLess6 = numbers.all { it < 6 }

    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

//------------------------------------------------------------------------------------------------------
//  NONE - Function 'none' returns 'true' if there are no elements that match the given predicate in
//  the collection.
    println("\nNONE: ")

    // 2. Checks if there are no odd elements (all elements are even).
    val noOdd = numbers.none { it % 2 == 1 }

    // 3. Checks if there are no elements greater than 6.
    val noGreater6 = numbers.none { it > 6 }

    println("No numbers are odd: $noOdd")
    println("No element greater than 6: $noGreater6")
}