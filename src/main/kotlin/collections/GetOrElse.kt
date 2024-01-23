package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  getOrElse - getOrElse provides safe access to elements of a collection. It takes an index and a
//  function that provides the default value in cases when the index is out of bound. getOrElse can
//  also be applied to Map to get the value for the given key.

    val list = listOf(0, 10, 20)
    // 1. Prints the element at the index 1.
    println(list.getOrElse(1) { 42 })
    // 2. Prints 42 because the index 10 is out of bounds.
    println(list.getOrElse(10) { 42 })

    val map = mutableMapOf<String, Int?>()

    // 3. Prints the default value because the key "x" is not in the map.
    println(map.getOrElse("x") { 1 })

    map["x"] = 3

    // 4. Prints "3", the value for the key "x".
    println(map.getOrElse("x") { 1 })

    map["x"] = null

    // 5. Prints the default value because the value for the key "x" is not defined.
    println(map.getOrElse("x") { 1 })
}