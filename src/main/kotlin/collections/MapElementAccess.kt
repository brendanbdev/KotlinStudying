package collections

fun main() {
//-----------------------------------------------------------------------------------------------------
//  MAP ELEMENT ACCESS - The difference between the '[]' operator and the 'getValue' function is what
//  happens when there is no key that matches the argument given.
//
//  For the '[]' operator, null is returned, and you can provide a default value using the ?: operator
//  to handle the case when the key is not present:
//  val value = map["key"] ?: defaultValue
//
//  For the 'getValue' function, a NoSuchElementException is thrown, and for maps created with
//  withDefault, getValue returns the default value instead of throwing an exception:
//  val mapWithDefault = mapOf("key1" to "value1", "key2" to "value2").withDefault { k -> k.length }

    val map = mapOf("key" to 42)

    // 1. Returns 42 because it's the value corresponding to the key "key".
    val value1 = map["key"]
    // 2. Returns null because "key2" is not in the map.
    val value2 = map["key2"]

    // 1.
    val value3: Int = map.getValue("key")

    val mapWithDefault = map.withDefault { k -> k.length }
    // 3. Returns the default value because "key2" is absent. For this key it's 4.
    val value4 = mapWithDefault.getValue("key2")

    try {
        // 4. Throws NoSuchElementException because "anotherKey" is not in the map.
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }


    println("value1 is $value1")
    println("value2 is $value2")
    println("value3 is $value3")
    println("value4 is $value4")
}