package edu.workshop.scala

object Breed extends Enumeration {
  type Breed = Value
  val doberman = Value("Doberman Pinscher")
  val yorkie = Value("Yorkshire Terrier")
  val scottie = Value("Scottish Terrier")
  val dane = Value("Great Dane")
  val portie = Value("Portuguese Water Dog")
}


object WeekDay extends Enumeration {
  type WeekDay = Value
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}

object Enumeration {
  def main(args: Array[String]): Unit = {
    import Breed._

    println("ID\tBreed")
    for (breed <- Breed.values) println(s"${breed.id}\t$breed")

    // print a list of Terrier breeds
    println("\nJust Terriers:")
    Breed.values filter (_.toString.endsWith("Terrier")) foreach println

    def isTerrier(b: Breed) = b.toString.endsWith("Terrier")

    println("\nTerriers Again??")
    Breed.values filter isTerrier foreach println



    import WeekDay._

    def isWorkingDay(d: WeekDay) = ! (d == Sat || d == Sun)

    WeekDay.values filter isWorkingDay foreach println
  }
}
