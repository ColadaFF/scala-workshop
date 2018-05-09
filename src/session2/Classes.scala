package session2

object Classes extends App {
  val person = new PersonArgumentsReview(name = "Julian", lastName = "Garcia")


  val account = Account.createAccountWithValue(100)
  val account1 = Account.createAccountWithValue(300)
  println(account)
  account.credit(100)
  println(account)
  account.debit(60)
  println(account)

  val mergedAccounts: Account = Account.mergeAccounts(account, account1)
  println(mergedAccounts)


}

