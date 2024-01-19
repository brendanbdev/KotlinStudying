package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  FIND - The 'find' and 'findLast' functions return the first or the last collection element that
//  matches the given predicate. If there are no such elements, these functions return null.

    // 1. Defines a collection of words.
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // 2. Looks for the first word starting with "some".
    val first = words.find { it.startsWith("some") }

    // 3. Looks for the last word starting with "some".
    val last = words.findLast { it.startsWith("some") }

    // 4. Looks for the first word containing "nothing".
    val nothing = words.find { it.contains("nothing") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}