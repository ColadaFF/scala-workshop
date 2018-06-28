package session5

class NotRunningTask[T](val value: T) extends AsyncTask[T] {
  override def isRunning: Boolean = false

  override def isFinished: Boolean = false

  override def hasNotRun: Boolean = true
}
