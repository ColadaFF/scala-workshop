package session5

class FinishedTask[T](val value: T) extends AsyncTask[T] {
  override def isRunning: Boolean = false

  override def isFinished: Boolean = true

  override def hasNotRun: Boolean = false
}
