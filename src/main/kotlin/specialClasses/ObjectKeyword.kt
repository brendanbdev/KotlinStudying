package specialClasses

import java.util.Random

/*
-------------------------------------------------------------------------------------------------------
OBJECT KEYWORD (A) - Classes and objects in Kotlin work the same way as in most object-oriented
languages: a class is a blueprint, and an object is an instance of a class. Usually, you define a
class and then create multiple instances of that class. In Kotlin, you also have the 'object' keyword.
It is used to obtain a data type with a single implementation. If you are a Java user and want to
understand what "single" means, you can think of the Singleton pattern: it ensures you that only one
instance of that class is created even if 2 threads try to create it. To achieve this in Kotlin, you
only need to declare an 'object': no class, no constructor, only a lazy instance. Why lazy? Because it
will be created once when the object is accessed. Otherwise, it won't even be created.

OBJECT EXPRESSION (B) - Here is a basic typical usage of an 'object' expression: a simple
object/properties structure. There is no need to do so in class declaration: you create a single
object, declare its members and access it within one function. Objects like this are often created in
Java as anonymous class instances.

OBJECT DECLARATION (C) - You can also use the 'object' declaration. It isn't an expression, and can't
be used in a variable assignment. You should use it to directly access its members.

COMPANION OBJECTS (D) - An object declaration inside a class defines another useful case: the
companion object. Syntactically it's similar to the static methods in Java: you call object members
using its class name as a qualifier. If you plan to use a companion object in Kotlin, consider using
a package-level function instead.
*/

// (A) 1. Defines a blueprint.
class LuckDispatcher {
    // (A) 2. Defines a method.
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

// (B) 1. Creates a function with parameters.
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    // (B) 2. Creates an object to use when calculating the result value.
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    // (B) 3. Accesses the object's properties.
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    // (B) 4. Prints the result.
    println("Total price: $$total")
}

// (C) 1. Creates an object declaration.
object DoAuth {
    // (C) 2. Defines the object method.
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// (D) 1. Defines a class.
class BigBen {
    // (D) 2. Defines a companion. Its name can be omitted.
    companion object Bonger {
        // (D) 3. Defines a companion object method.
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    // (A) 3. Creates instances.
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    // (A) 4. Calls the method on instances.
    d1.getNumber()
    d2.getNumber()

    // (B) 5. Calls the function. This is when the object is actually created.
    rentPrice(10, 2, 1)

    // (C) 3. Calls the method. This is when the object is actually created.
    DoAuth.takeParams("foo", "qwerty")

    // (D) 4. Calls the companion object method via the class name.
    BigBen.getBongs(12)
}