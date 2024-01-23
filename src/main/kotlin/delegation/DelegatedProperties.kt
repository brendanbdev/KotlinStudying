package delegation

import kotlin.reflect.KProperty

//---------------------------------------------------------------------------------------------------
//  (A) DELEGATED PROPERTIES - Kotlin provides a mechanism of delegated properties that allow
//  delegating the calls of the property 'set' and 'get' methods to a certain object. The delegate
//  object in this case should have the method getValue. For mutable properties, you'll also need
//  setValue.

class Example {
    // (A) 1. Delegates property 'p' of type String to the instance of class 'Delegate'. The
    // delegate object is defined after the 'by' keyword.
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate() {
    // (A) 2. Delegation methods. The signatures of these methods are always as shown in the example.
    // Implementations may contain any steps you need. For immutable properties only getValue is
    // required.
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        // thisRef will be "Example Class", prop.name will be "p"
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        // Assigning a value to 'p' (for example, obj.p = "NEW") will create this print statement:
        // "NEW has been assigned to p in Example Class"
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

//---------------------------------------------------------------------------------------------------
//  (B) STANDARD DELEGATES - The Kotlin standard library contains a bunch of useful delegates, like
//  'lazy', 'observable', and others. You may use them as is. For example 'lazy' is used for lazy
//  initialization.
//
//  If you want thread safety, use blockingLazy() instead: it guarantees that the
//  values will be computed only in one thread and that all threads will see the same value.

class LazySample {
    init {
        // (B) 1. Property 'lazy' is not initialized on object creation.
        println("created!")
    }

    val lazyStr: String by lazy {
        // (B) 2. The first call to get() executes the lambda expression passed to lazy() as an
        // argument and saves the result.
        println("computed!")
        "my lazy"
    }
}

//---------------------------------------------------------------------------------------------------
//  (C) STORING PROPERTIES IN A MAP - Property delegation can be used for storing properties in a
//  map. This is handy for tasks like parsing JSON or doing other "dynamic" stuff.
//
//  You can delegate mutable properties to a map as well. In this case, the map will be modified upon
//  property assignments. Note that you will need MutableMap instead of read-only Map.

class User(val map: Map<String, Any?>) {
    // (C) 1. Delegates take values from the 'map' by the string keys - names of properties.
    val name: String by map
    val age: Int     by map
}

fun main() {
    // (A) DELEGATED PROPERTIES:
    val e = Example()
    println(e.p)
    e.p = "NEW"

    // (B) STANDARD DELEGATES:
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    // Further calls to get() return the saved result.
    println(" = ${sample.lazyStr}")

    // (C) STORING PROPERTIES IN A MAP:
    val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))
    println("name = ${user.name}, age = ${user.age}")
}