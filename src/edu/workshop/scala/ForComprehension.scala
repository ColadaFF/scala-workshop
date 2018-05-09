package edu.workshop.scala

object ForComprehension {
  def main(args: Array[String]): Unit = {
    val dogBreeds1 = List("Doberman", "Yorkshire Terrier", "Dachshund",
      "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

    for (breed <- dogBreeds1) println(breed)


    // Generators
    for (i <- 1 to 10) println(i)



    // Guards filtering

    val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
      "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
    for (breed <- dogBreeds if breed.contains("Terrier")
    ) println(breed)
  }

}
