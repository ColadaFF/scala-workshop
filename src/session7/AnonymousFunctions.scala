package session7

object AnonymousFunctions extends App {
  /**
    * Syntax (x: Double) => 3 * x
    */

  // normal syntax
  val triple = (x: Double) => 3 * x

  def tripleAS(x: Double) = 3 * x

  val resultArr = Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
  val resultArrAS = Array(3.14, 1.42, 2.0).map { x: Double => 3 * x }

}
