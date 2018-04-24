package edu.scala.workshop

object CommonTypes {
  def main(args: Array[String]): Unit = {
    /*
     Commonly used types
     Scala has seven number types built in:
     Byte,
     Char,
     Short,
     Int,
     Long,
     Float,
     Double,
     Boolean.

     The primal difference with java ones is that in scala this types are
     classes, so there is no difference between a primitive type and
     a class type. So you can invoke methods on numbers
     */

    println(1.toString)

    /**
      * we will review ranges later in another session of the workshops.
      * for now lets just say that a Range is a collection of numbers.
      */
    println(1.to(10))


    /**
      * Scala uses the java.lang.String class for strings, however it augments
      * over 100 operations in the StringOps class.
      * For example intersect method yields the characters that are common in two strings
      */

    println("Hello".intersect("World")) // Yields "lo"


    /**
      * Similarly, classes like RichInt, RichFloat or RichDouble have the same effect
      * over Int, Float and Double classes.
      * The ".to" method is path of the RichInt class.
      */


    val value = 1 + 2; val value3 = 3 + 1
    val value2 = 1 +
    2
    println(value)
    println(value2)
    println(value3)

  }
}
