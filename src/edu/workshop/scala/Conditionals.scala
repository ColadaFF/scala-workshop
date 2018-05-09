package edu.workshop.scala

object Conditionals {
  def basicConditional(x: Int): Int = {
    // scala basic syntax for conditionals
    if (x > 0) 1 else -1
  }


  def main(args: Array[String]): Unit = {
    val x: Int = 3
    println(basicConditional(x)) // yields 1


    // Conditional assignation
    val s = if (x > 0) 1 else -1

    var f = 0
    // same effect as before
    if (x > 0) f = 1 else f = -1
  }
}
