package session5

trait ConsoleLogger extends Logger {
  override def log(message: String): Unit = {
    println(message)
  }

  def warn(message: String): Unit = {
    log(s"WARN: $message")
  }

  def info(message: String): Unit = {
    log(s"INFO: $message")
  }
  def error(message: String): Unit = {
    log(s"ERROR: $message")
  }
  def debug(message: String): Unit = {
    log(s"DEBUG: $message")
  }
}
