package singleton


class SingletonKotlinJavaWay private constructor() {

  private object HOLDER {
    val INSTANCE = SingletonKotlinJavaWay()
  }

  companion object {
    val instance: SingletonKotlinJavaWay by lazy { HOLDER.INSTANCE }
  }
}





object SingletonKotlinClass {
  val const1 = "Const1"
}

fun main() {
  println(SingletonKotlinClass.const1)
}