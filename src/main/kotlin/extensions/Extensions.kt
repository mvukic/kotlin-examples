package extensions

import java.math.BigDecimal

// extending existing classes
// - ability to add functionality to third party classes (without extending!)
// - add features to old classes without changing their signature

// extension functions

// extension properties

class Person(val first: String, val last: String)

fun Person.getFullName(separator: String): String {
    return "$first$separator$last"
}

val Person.fullName: String
    get() {
         return "$first $last"
    }

fun main() {
    val person = Person("First", "Last")
    println(person.getFullName(" "))
    println(person.fullName)

}




// Actually exists , is named isNotEmpty
// - hover over isNotEmpty and show source code

// kotlin stdlib is basically a bunch of extensions

// extension on anything
fun<T> List<T>.hasElements(): Boolean {
    return this.size > 0
}