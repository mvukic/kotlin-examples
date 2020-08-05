package http

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest

fun createHttpClient(httpVersion: HttpClient.Version, setup: HttpClient.Builder.() -> Unit): HttpClient {
  return HttpClient.newBuilder().apply{
    version(httpVersion)
    setup()
  }.build()
}


fun createHttpRequest(uri: String, setup: HttpRequest.Builder.() -> Unit): HttpRequest {
  return HttpRequest.newBuilder().apply{
    uri(URI.create(uri))
    setup()
  }.build()
}