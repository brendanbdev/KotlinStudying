package scopeFunctions

fun main() {
//-----------------------------------------------------------------------------------------------------
//  RUN - Like 'let', 'run' is another scoping function from the standard library. Basically, it does
//  the same: executes a code block and returns its result. The difference is that inside 'run' the
//  object is accessed by 'this'. This is useful when you want to call the object's methods rather
//  than pass it as an argument. (Another big difference is that 'let' is conventionally used for
//  returning transformations of the object without modifying the object's state (although you can
//  modify the object's state with let). 'run' is conventionally used for modifying the object's
//  state. In my opinion, you can generally just use run over any other scope function.)

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        // 1. Calls the given block on a nullable variable.
        ns?.run {
            // 2. Inside 'run', the object's members are accessed without its name.
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            // 3. 'run' returns the 'length' of the given String if it's not null.
            length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}