package session4

object ReduceFold extends App {
  def sum(acc: Int, current: Int): Int = {
    acc + current
  }

  def concat(acc: String, current: Int): String = {
    s"$acc, $current"
  }

  def reduceValues(col: Seq[Int], defaultValue: Int = 0): Int = {
    col.reduceOption(sum).getOrElse(defaultValue)
  }

  val collection = Seq(1, 2, 3, 4, 5)
  val empty = Seq()

  val result = reduceValues(empty)

  val resultInitial = collection.fold(10)(sum)

  println(result)


  // ZIP


  val colZip1 = Seq(1, 2, 3, 4)
  val colZip2 = Seq(2, 3, 4, 5)

  val zipped = colZip1.zip(colZip2)
  println(zipped.head)
  println(zipped.last)
  println(zipped.headOption)
  println(zipped.lastOption)
  println(zipped.tail)






}
