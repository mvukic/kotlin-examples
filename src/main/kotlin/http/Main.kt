package http

import kotlinx.coroutines.future.await
import kotlinx.coroutines.runBlocking
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.concurrent.CompletableFuture
import kotlin.time.measureTime
import kotlin.time.seconds
import kotlin.time.toJavaDuration

val client = createHttpClient(HttpClient.Version.HTTP_2) {
  followRedirects(HttpClient.Redirect.NEVER)
  connectTimeout(20.seconds.toJavaDuration())
}

val request = createHttpRequest("https://jsonplaceholder.typicode.com/todos/1") {
  timeout(20.seconds.toJavaDuration())
}


fun main() {

  // Fetch using native completable feature
//  fetchUrlWithoutCoroutine(request).join()

  // run using kotlin coroutines
  runBlocking {
    measureTime {
      val response = fetchUriWithCoroutines(request)
      println(response.body())
    }.also {
      println(it.inMilliseconds)
    }

  }
}

fun fetchUrlWithoutCoroutine(request: HttpRequest): CompletableFuture<Void> {
  return client
    .sendAsync(request, HttpResponse.BodyHandlers.ofString())
    .thenApply { t: HttpResponse<String> -> t.body() }
    .thenAccept { htmlBody: String -> println(htmlBody)}
}

suspend fun fetchUriWithCoroutines(request: HttpRequest): HttpResponse<String> {
  val response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
  return response.await()
}
