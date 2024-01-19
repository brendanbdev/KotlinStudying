package collections

fun main() {
//------------------------------------------------------------------------------------------------------
//  first, last - These functions return the first and the last element of the collection
//  correspondingly. You can also use them with a predicate; in this case, they return the first or the
//  last element that matches the given predicate. If a collection is empty or doesn't contain elements
//  matching the predicate, the functions throw NoSuchElementException.

    // 1. Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // 2. Picks the first element.
    val first = numbers.first()
    // 3. Picks the last element.
    val last = numbers.last()

    // 4. Picks the first even element.
    val firstEven = numbers.first { it % 2 == 0 }
    // 5. Picks the last odd element.
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

//------------------------------------------------------------------------------------------------------
//  firstOrNull, lastOrNull - These functions work almost the same way with one difference: they
//  return null if there are no matching elements.

    // 1. Defines a collection of words.
    val words = listOf("foo", "bar", "baz", "faz")
    // 2. Defines an empty collection.
    val empty = emptyList<String>()

    // 3. Picks the first element from empty collection. It supposed to be null.
    val firstOrNull = empty.firstOrNull()
    // 4. Picks the last element from empty collection. It supposed to be null as well.
    val lastOrNull = empty.lastOrNull()

    // 5. Picks the first word starting with 'f'.
    val firstF = words.firstOrNull { it.startsWith('f') }
    // 6. Picks the first word starting with 'z'.
    val firstZ = words.firstOrNull { it.startsWith('z') }
    // 7. Picks the last word ending with 'f'.
    val lastF = words.lastOrNull { it.endsWith('f') }
    // 8. Picks the last word ending with 'z'.
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println("Empty list: first is $firstOrNull, last is $lastOrNull")
    println("Word list: first item starting with 'f' is $firstF, first item starting with 'z' is $firstZ")
    println("Word list: last item ending with 'f' is $lastF, last item ending with 'z' is $lastZ")
}