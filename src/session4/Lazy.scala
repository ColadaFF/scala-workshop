package session4

object Lazy extends App {
  def numsFrom(n: BigInt): Stream[BigInt] = {
    n #:: numsFrom(n)
  }


  val stream1 = numsFrom(10)
    .map(x => x * 2)
    .take(10)
      .tail
  println(stream1)

}
