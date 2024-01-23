package delegation

import kotlin.properties.Delegates

class Example2 {
    var observableProperty: String by Delegates.observable("Initial Value") { _, old, new ->
        println("Property changed from $old to $new")
    }
}

fun main() {
    val exampleObj = Example2()

    // Modifying observableProperty triggers the observable callback
    exampleObj.observableProperty = "Updated Value"
}