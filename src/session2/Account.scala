package session2

object Account {
  def createEmptyAccount = new Account(0)
  def createSavingsAccount = new Account(1)
  def createAccountWithValue(value: Int) = new Account(value)

  def mergeAccounts(account1: Account, account2: Account): Account = {
    new Account(account1.total + account2.total)
  }
}


class Account(initialValue: Int = 0) {
  private var total = initialValue
  def credit(value: Int): Unit = {
    total = total + value
  }

  def debit(value: Int): Unit = {
    total = total - value
  }

  def serialized:String = {
    s"Account value: $total"
  }


  override def toString = s"Account(total=$total)"
}
