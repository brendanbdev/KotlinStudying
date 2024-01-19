package collections

fun main() {
//----------------------------------------------------------------------------------------------------
//  SET - A set is an unordered collection that does not support duplicates. For creating sets, there
//  are functions setOf() and mutableSetOf(). A read-only view of a mutable set can be obtained by
//  casting it to Set.

    // 1. Creates a Set with given elements.
    val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

    fun addIssue(uniqueDesc: String): Boolean {
        // 2. Returns a boolean value showing if the element was actually added.
        return openIssues.add(uniqueDesc)
    }

    fun getStatusLog(isAdded: Boolean): String {
        // 3. Returns a string, based on function input parameter.
        return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
    }

    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    // 4. Prints a success message: the new element is added to the Set.
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    // 5. Prints a failure message: the element can't be added because it duplicates an existing element.
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}