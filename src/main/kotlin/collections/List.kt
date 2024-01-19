package collections

fun main() {
//----------------------------------------------------------------------------------------------------
//  LIST - A list is an ordered collection of items. In Kotlin, lists can be either mutable
//  (MutableList) or read-only (List). For list creation, use the standard library functions listOf()
//  for read-only lists and mutableListOf() for mutable lists. To prevent unwanted modifications,
//  obtain read-only views of mutable lists by casting them to List.

    // 1. Creates a MutableList.
    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
    // 2. Creates a read-only view of the list. (sudoers points to the systemUsers object. This means
    // when systemUsers is updated, sudoers is updated as well.)
    val sudoers: List<Int> = systemUsers

    // 3. Adds a new item to the MutableList.
    fun addSystemUser(newUser: Int) {
        systemUsers.add(newUser)
    }

    // 4. A function that returns an immutable List.
    fun getSysSudoers(): List<Int> {
        return sudoers
    }

    // 5. Updates the MutableList. All related read-only views are updated as well since they point to
    // the same object.
    addSystemUser(4)
    // 6. Retrieves the size of the read-only list.
    println("Tot sudoers: ${getSysSudoers().size}")
    // 7. Iterates the list and prints its elements.
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
    // 8. Attempting to write to the read-only view causes a compilation error.
    // getSysSudoers().add(5) <- Error!
}