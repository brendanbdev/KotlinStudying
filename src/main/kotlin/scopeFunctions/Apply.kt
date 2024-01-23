package scopeFunctions

fun main() {
//-----------------------------------------------------------------------------------------------------
//  APPLY - 'apply' executes a block of code on an object and returns the object itself. Inside the
//  block, the object is referenced by 'this'. This function is handy for initializing objects.

    data class Person(var name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }

    // 1. Creates a Person() instance with default property values.
    val jake = Person()
    // 2. Applies the code block (next 3 lines) to the instance.
    val stringDescription = jake.apply {
        // 3. Inside 'apply', it's equivalent to jake.name = "Jake".
        name = "Jake"
        age = 30
        about = "Android developer"
        // 4. The return value is the instance itself, so you can chain other operations.
    }.toString()
    println(stringDescription)
}