package collections

fun main() {
//-----------------------------------------------------------------------------------------------------
//  minOrNull, maxOrNull - minOrNull and maxOrNull functions return the smallest and the largest
//  element of a collection. If the collection is empty, they return null.

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    // 1. For non-empty collection, functions return the smallest and the largest element.
    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    // 2. For empty collections, both functions return null.
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")
    // 3. For collection with only one element, both functions return the same value.
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")
}