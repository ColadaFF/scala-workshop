package session6

import java.time.LocalDateTime
import java.util.UUID

object BankRunner extends App {

  val account = SavingsAccount(
    no = "123",
    name = "Julian",
    dateOfOpening = LocalDateTime.now(),
    balance = BigDecimal(100),
    dateOfClose = None
  )

  val account2 = account.copy(name = "Cristian")
  val account3 = AccountServices.creditSavings(account, BigDecimal(100))

  println(account)
  println(account2)
  println(account3)
  println(account)

}
