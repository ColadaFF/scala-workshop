package session5

class RunningTask[T](val value: T) extends AsyncTask[T] {
  override def isRunning: Boolean = true

  override def isFinished: Boolean = false

  override def hasNotRun: Boolean = false
}
