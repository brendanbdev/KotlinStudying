package collections

fun main() {
//-----------------------------------------------------------------------------------------------------
//  ZIP - 'zip' function merges two given collections into a new collection. By default, the result
//  collection contains 'Pairs' of source collection elements with the same index. However, you can
//  define your own structure of the result collection element. The size of the result collection
//  equals to the minimum size of a source collection (the remaining elements of the larger collection
//  are simply not going to be in the result collection at all).

    // 1. Defines two collections.
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    // 2. Merges them into a list of pairs. The infix notation is used here.
    val resultPairs = A zip B
    // 3. Merges them into a list of String values by the given transformation.
    val resultReduce = A.zip(B) { a, b -> "$a$b" }

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}