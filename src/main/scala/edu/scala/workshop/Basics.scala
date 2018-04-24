package edu.scala.workshop

object Basics extends App {
  // usage of var and val
  // val can't be reassigned
  val answer = 5 * 8
  // answer = 1 would throw an error.

  println(answer)

  // var can be reassigned
  var greeting = "Hello, "
  greeting += "World!"

  println(greeting)

  // multiple variables
  val xmax, ymax = 100 // Sets xmax and ymax to 100

  var greeting2, message: String = null

  message = "Hi there"

  println(message)





}
