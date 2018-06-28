package session5

import scala.util.{Failure, Success, Try}

object TryRunner extends App {
  def divide(upperValue: Int, lowerValue: Int): Try[Float] = {
    try {
      Success(upperValue / lowerValue)
    } catch {
      case e: ArithmeticException => Failure(e)
      case _ => Success(0)
    }
  }

  val value = divide(1, 10)
  val value1 = divide(1, 19)
  val value2 = divide(1, 0)


  val seqSuccess = Seq(value, value1, value2).filter(_.isSuccess)
  val seqError = Seq(value, value1, value2).filter(_.isFailure)

  println(seqSuccess)
  println(seqError)
}
