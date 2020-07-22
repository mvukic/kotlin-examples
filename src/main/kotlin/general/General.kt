package general

fun main() {
    // string interpolation
    val str1 = "1"
    val str2 = "2"
    val interpolated = "$str1 $str2"


    // elvis operator - nullability check
    val number: Int? = null

    println(number?.times(number))
    println(number?.times(number) ?: 0)

}
