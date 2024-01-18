package introduction

fun main() {
//----------------------------------------------------------------------------------------------------
//  CLASSES - The class declaration consists of the class name, the class header (specifying its type
//  parameters, the primary constructor etc.) and the class body, surrounded by curly braces. Both the
//  header and the body are optional; if the class has no body, curly braces can be omitted.

    // 1. Declares a class named 'Customer' without any properties or user-defined constructors.
    // A non-parameterized default constructor is created by Kotlin automatically.
    class Customer

    // 2. Declares a class with two properties: immutable 'id' and mutable 'email', and a constructor
    // with two parameters 'id' and 'email'.
    class Contact(val id: Int, var email: String)

    // 3. Creates an instance of the class 'Customer' via the default constructor. Note that there is
    // no 'new' keyword in Kotlin.
    val customer = Customer()

    // 4. Creates an instance of the class 'Contact' using the constructor with two arguments.
    val contact = Contact(1, "mary@gmail.com")

    // 5. Accesses the property 'id'.
    println(contact.id)

    // 6. Updates the value of the property 'email'.
    contact.email = "jane@gmail.com"
}
