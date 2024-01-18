package specialClasses

fun main() {
//----------------------------------------------------------------------------------------------------
//  DATA CLASSES - Data classes make it easy to create classes that are used to store values. Such
//  classes are automatically provided with methods for copying, getting a string representation,
//  and using instances in collections. You can override these methods with your own implementations
//  in the class declaration.

    // 1. Defines a data class with the 'data' modifier.
    data class User(val name: String, val id: Int) {
        override fun equals(other: Any?) =
            // 2. Override the default 'equals' method by declaring users equal if they have the same
            // 'id'. (Also, 'is' checks the type and returns a boolean, and smart casts the object to
            // that type if it is 'true' (although the smart casting is not used in this example, it
            // is used in the SealedClasses file in this package in the 'when' statement).)
            other is User && other.id == this.id
    }

    val user = User("Alex", 1)
    // 3. Method toString is auto-generated, which makes println output look nice.
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // 4. Our custom 'equals' considers two instances equal if their 'id's are equal.
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    // 5. Data class instances with exactly matching attributes have the same 'hashCode'. (The default
    // behavior for the 'hashCode' method is to generate a hash code based on the object's memory
    // address. Therefore, for regular classes (non-data classes) with exactly matching attributes,
    // instances will not necessarily have the same 'hashCode' unless you override the 'hashCode'
    // method to provide a custom implementation.)
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    // 6. Auto-generated 'copy' function makes it easy to create a new instance.
    println(user.copy())
    // 7. 'copy' creates a new instance, so the object and its copy have distinct references.
    println(user === user.copy())
    // 8. When copying, you can change values of certain properties. 'copy' accepts arguments in the
    // same order as the class constructor.
    println(user.copy("Max"))
    // 9. Use 'copy' with named arguments to change the value despite the properties order.
    println(user.copy(id = 3))

    // 10. Auto-generated 'componentN' functions let you get the values of properties in the order of declaration.
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}