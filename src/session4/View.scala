package session4

object View extends App {
  val palindromicSquares = (1 to 1000000)
    .view
    .map(x => x * x)
    .filter(x => {
      val normalValue = x.toString
      val reverse = x.toString.reverse
      println(s"$normalValue, $reverse, ${normalValue == reverse}")
      normalValue == reverse
    })

  println(palindromicSquares.take(10).force)
}
