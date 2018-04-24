package edu.scala.workshop

object ArithmeticOperations {
  def main(args: Array[String]): Unit = {
    /**
      * you can use the +, - or * operators in numbers like
      * you do in java or c, however in scala these are methods
      */

    print(1 + 2)
    // is the same as
    print(1.+(2))

    // but scala has no ++
    var counter = 1
    counter += 1 // is the way.

    val x: BigInt = 1234567890
    println(x * x * x) // this is not possible in java.


    import scala.math._ // In Scala, the _ character is a "wildcard," like * in Java

    sqrt(2) // Yields 1.4142135623730951

    pow(2, 4) // Yields 16.0

    min(3, Pi) // Yields 3.0


    // Apply method

    val s = "Hello"

    println(s(4)) // Yields 'o'
    println(s.apply(4)) // the same as before

    print(BigInt("1234567890"))
    // is a shortcut for
    println(BigInt.apply("1234567890"))





    val valueStr = "hello"
    val concatValue = valueStr concat "Test"


    val whale = new Whale()

    whale("New name")
    println(whale)

    whale.apply("new name 2")
    println(whale)

    val person = Person.createPersonWithAddress("New address")
    val person2 = new Person()

  }
}
