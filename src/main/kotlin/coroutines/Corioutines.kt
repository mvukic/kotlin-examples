package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
  create10KThreads()
  create10KCoroutines()
}

fun create10KThreads() {
  val time = measureTimeMillis {
    for(i in 1..10000) {
      Thread {
        Thread.sleep(1)
      }.run()
    }
  }
  println(time)
}

fun create10KCoroutines(){
  val time = measureTimeMillis {
    runBlocking {
      for(i in 1..100000) {
        launch {
          delay(10000L)
        }
      }
    }
  }
  println(time)
}