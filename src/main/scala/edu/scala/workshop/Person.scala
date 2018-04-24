package edu.scala.workshop

object Person {
  def createPersonWithAddress(address: String): Person = {
    new Person(address)
  }
}

protected class Person(val address: String)
