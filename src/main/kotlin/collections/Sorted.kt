package collections

import kotlin.math.abs

fun main() {
//------------------------------------------------------------------------------------------------------
//  SORTED - 'sorted' returns a list of collection elements sorted according to their natural sort
//  order (ascending). 'sortedBy' sorts elements according to natural sort order of the values
//  returned by specified selector function.

    // 1. Defines a collection of shuffled numbers.
    val shuffled = listOf(5, 4, 2, 1, 3, -10)
    // 2. Sorts it in the natural order.
    val natural = shuffled.sorted()
    // 3. Sorts it in the inverted natural order by using '-it' as a selector function.
    val inverted = shuffled.sortedBy { -it }
    // 4. Sorts it in the inverted natural order by using sortedDescending.
    val descending = shuffled.sortedDescending()
    // 5. Sorts it in the inverted natural order of items' absolute values by using abs(it) as a
    // selector function.
    val descendingBy = shuffled.sortedByDescending { abs(it)  }

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")
}