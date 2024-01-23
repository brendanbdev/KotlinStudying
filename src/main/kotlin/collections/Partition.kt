package collections

fun main() {
//-----------------------------------------------------------------------------------------------------
//  PARTITION - The partition function splits the original collection into a pair of lists using a
//  given predicate:
//      1. Elements for which the predicate is true.
//      2. Elements for which the predicate is false.

    // 1. Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // 2. Splits 'numbers' into a 'Pair' of lists with even and odd numbers.
    val evenOdd = numbers.partition { it % 2 == 0 }
    // 3. Splits 'numbers' into two lists with positive and negative numbers. Pair destructuring is
    // applied here to get the 'Pair' members.
    val (positives, negatives) = numbers.partition { it > 0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")
}