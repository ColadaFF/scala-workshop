package session7

object HOCFunctions extends App {

  val resultMap = (1 to 9).map(0.1 * _)

  (1 to 9).filter(_ % 2 == 0)

  (1 to 9).reduceLeft(_ * _)

  println(resultMap)


  // Currying

  val mulOneAtATime = (x: Int) => ((y: Int) => x * y)

  val mulBy6 = mulOneAtATime(6)

  val result = mulBy6(7)

  println(result)

}
