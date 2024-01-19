package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  COUNT - 'count' functions returns either the total number of elements in a collection or the number
//  of elements matching the given predicate.

    // 1. Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // 2. Counts the total number of elements.
    val totalCount = numbers.count()
    // 3. Counts the number of even elements.
    val evenCount = numbers.count { it % 2 == 0 }

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")
}