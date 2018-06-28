package session5

object OptionalRunner extends App {
  def divide(upperValue: Int, lowerValue: Int): Option[Float] = {
    try {
      Some(upperValue / lowerValue)
    } catch {
      case _: ArithmeticException => None
      case _ => None
    }
  }


  divide(1, 10) match {
    case Some(value: Float) => println(s"Got Value $value")
    case None => println("Got no value")
  }

  divide(1, 0) match {
    case Some(value: Float) => println(s"Got Value $value")
    case None => println("Got no value")
  }

}
