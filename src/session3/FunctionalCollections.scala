package session3

object FunctionalCollections extends App {
  val timesTwo: Int => Int = (value: Int) => {
    value * 2
  }

  val reduceBy3: Int => Float = (value: Int) => value / 3

  val onlyEvens: Int => Boolean = value => value % 2 == 0

  val rangeValues: Int => Seq[Int] = value => Range(0, value)

  val sum = (value1: Int, value2: Int) => value1 + value2
  val concat: (Int, Int) => String = (value1: Int, value2: Int) => s"$value1, $value2"


  val seq = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val seqTimesTwo = seq
    .filterNot(onlyEvens)
    .map(timesTwo)
    .flatMap(value => rangeValues(value).map(timesTwo))
    .reduce(sum)


  //.map(reduceBy3)

  println(seqTimesTwo)


}
