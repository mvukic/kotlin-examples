package general

import kotlin.system.measureTimeMillis
import kotlin.time.measureTimedValue

fun main() {
    // string interpolation
    val str1 = "1"
    val str2 = "2"
    val interpolated = "$str1 $str2"


    // elvis operator - nullability check
    val number: Int? = null

    println(number?.times(number))
    println(number?.times(number) ?: 0)



    // measure execution time
    val duration = measureTimeMillis {
        println("start")
        Thread.sleep(5000)
        println("end")
    }
    println("Duration: $duration")

}
