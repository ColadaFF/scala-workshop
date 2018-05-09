package edu.workshop.scala

class ServiceImportante(name: String) {
  def work(i: Int): Int = {
    println(s"ServiceImportante: Doing important work! $i")
    i + 1
  }
}


object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val service1 = new ServiceImportante("uno")
    (1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))
  }
}
