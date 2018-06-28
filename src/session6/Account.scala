package session6

import java.time.LocalDateTime


trait Account {

  def no: String

  def name: String

  def dateOfOpening: LocalDateTime

  def dateOfClose: Option[LocalDateTime]

  def balance: BigDecimal
}


case class SavingsAccount(no: String,
                          name: String,
                          dateOfOpening: LocalDateTime,
                          dateOfClose: Option[LocalDateTime],
                          balance: BigDecimal = BigDecimal(0)
                         ) extends Account {
  val rateInterest = 0.05
}

case class CreditAccount(no: String,
                         name: String,
                         dateOfOpening: LocalDateTime,
                         dateOfClose: Option[LocalDateTime],
                         balance: BigDecimal = BigDecimal(10)
                        ) extends Account