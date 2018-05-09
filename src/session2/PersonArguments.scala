package session2

class PersonArguments(val name: String, var value: Int) {
  override def toString: String = s"PersonArguments={$value, $name}"
}
