package session5

import java.time.Instant

trait TimestampLogger extends Logger with ConsoleLogger {
  override def log(message: String): Unit = {
    super.log(s"${Instant.now.toEpochMilli}: $message")
  }
}
