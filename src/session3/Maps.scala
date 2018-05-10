package session3

import scala.collection.mutable

object Maps extends App {
  val map = mutable.Map("n1" -> "Julian", "n2" -> "Jefferson")
  val mapEmpty = mutable.Map[String, String]()

  val modMap = map -= "n1"


  println(map)
}
