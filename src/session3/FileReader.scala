package session3

object FileReader extends App {
  val filePathName = "myfile.txt"
  val file = new java.io.File(filePathName)
  val in = new java.util.Scanner(file)

  while (in.hasNext()) {
    val word = in.next()
    // acá va su lógica....
  }
}
