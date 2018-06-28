package session5

trait AsyncTask[T] {
  val value: T

  def isRunning: Boolean

  def isFinished: Boolean

  def hasNotRun: Boolean
}
