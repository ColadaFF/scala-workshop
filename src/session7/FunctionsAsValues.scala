package session7

import scala.math._

object FunctionsAsValues extends App {

  val num = 3.14

  val fun: Double => Double = ceil

  val result = fun(num)
  println(result)



  val arrayResult = Array(1.1, 2.7, 3.3, 4.5).map(fun)
  arrayResult.foreach(println)

}
