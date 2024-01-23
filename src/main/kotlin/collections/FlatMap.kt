package collections

fun main() {
//-----------------------------------------------------------------------------------------------------
//  flatMap - flatMap transforms each element of a collection into an iterable object and builds a
//  single list of the transformation results. The transformation is user-defined.

    // 1. Defines a collection of Strings with fruit names.
    val fruitsBag = listOf("apple","orange","banana","grapes")
    // 2. Defines a collection of Strings with clothes names.
    val clothesBag = listOf("shirts","pants","jeans")
    // 3. Adds 'fruitsBag' and 'clothesBag' to the 'cart' list.
    val cart = listOf(fruitsBag, clothesBag)
    // 4. Builds a 'map' of 'cart' elements, which is a list of two lists.
    val mapBag = cart.map { it }
    // 5. Builds a 'flatMap' of 'cart' elements, which is a single list consisting of elements from
    // both lists.
    val flatMapBag = cart.flatMap { it }

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}