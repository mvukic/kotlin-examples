package extensions


// kotlin stdlib is basically a bunch of extensions


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