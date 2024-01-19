package collections

fun main() {
//----------------------------------------------------------------------------------------------------
//  FILTER - filter function enables you to filter collections. It takes a filter predicate as a
//  lambda-parameter. The predicate is applied to each element. Elements that make the predicate
//  'true' are returned in the result collection.

    // 1. Defines collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // 2. Gets positive numbers.
    val positives = numbers.filter { x -> x > 0 }

    // 3. Uses the shorter 'it' notation to get negative numbers.
    val negatives = numbers.filter { it < 0 }
}