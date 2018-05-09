package session2

class Person {
  println("Creating Person class")
  val value: Int = {println("Creating Value"); 1 + 2}

  var name = ""


  println("Ended Person class")

  override def toString: String = s"Person={$value, $name}"
}
