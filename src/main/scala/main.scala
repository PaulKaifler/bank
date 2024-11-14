@main
def main() = {
  class SimpleAccount(var balance: Double, val interest: Double) extends Account

  // Example account 1: Alice's account
  val aliceAccount = new SimpleAccount(75.50, 4) // Balance in EUR
  println(s"Alice's initial balance: ${aliceAccount.balance} EUR")

  aliceAccount.deposit(20.0)
  println(s"Alice's balance after deposit: ${aliceAccount.balance} EUR")

  aliceAccount.applyInterest()
  println(s"Alice's balance after getting interest: ${aliceAccount.balance} EUR")

  aliceAccount.withdraw(19.75)
  println(s"Alice's balance after withdrawal: ${aliceAccount.balance} EUR")

}

trait Account {
  var balance: Double // Balance in EUR
  var interest: Double

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (balance >= amount) balance -= amount
    else println("Insufficient funds")
  }

  def applyInterest(): Unit = {
    balance += balance * interest / 100
  }
}