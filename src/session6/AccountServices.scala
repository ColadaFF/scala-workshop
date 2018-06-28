package session6

object AccountServices {

  def creditSavings(account: SavingsAccount, amount: BigDecimal): Account = {
    account.copy(balance = account.balance + amount)
  }

  def debitSavings(account: SavingsAccount, amount: BigDecimal): Account = {
    account.copy(balance = account.balance + amount)
  }
}
