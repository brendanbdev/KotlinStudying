package scopeFunctions

fun main() {
//-----------------------------------------------------------------------------------------------------
//  ALSO - 'also' works like 'apply': it executes a given block and returns the object called. Inside
//  the block, the object is referenced by 'it', so it's easier to pass it as an argument. This
//  function is handy for embedding additional actions, such as logging in call chains.

    data class Person(var name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }

    fun writeCreationLog(p: Person) {
        println("A new person ${p.name} was created.")
    }

    // 1. Creates a Person() object with the given property values.
    val jake = Person("Jake", 30, "Android developer")
        // 2. Applies the given code block to the object. The return value is the object itself.
        .also {
            // 3. Calls the logging function passing the object as an argument.
            writeCreationLog(it)
        }

    val brendan = Person("Brendan", 26, "Android developer")
        .run {
            writeCreationLog(this)
        }
}