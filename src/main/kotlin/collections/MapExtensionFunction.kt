package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  MAP EXTENSION FUNCTION - map extension function enables you to apply a transformation to all
//  elements in a collection. It takes a transformer function as a lambda-parameter.

    // 1. Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // 2. Doubles numbers.
    val doubled = numbers.map { x -> x * 2 }

    // 3. Uses the shorter 'it' notation to triple the numbers.
    val tripled = numbers.map { it * 3 }
}