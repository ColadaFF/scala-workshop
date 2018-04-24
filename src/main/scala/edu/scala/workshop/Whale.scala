package edu.scala.workshop

class Whale {
  var name = "NO_NAME"
  def apply(str: String): Unit = {
    this.name = str
  }

  override def toString: String = this.name
}
