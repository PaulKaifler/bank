@main
def main() = {
  class SimpleAccount(var balance: Int) extends Account

  // Example account 1: Alice's account
  val aliceAccount = new SimpleAccount(7550) // Balance in EUR
  println(s"Alice's initial balance: ${aliceAccount.getBalanceInEur()} EUR")

  aliceAccount.deposit(200)
  println(s"Alice's balance after deposit: ${aliceAccount.getBalanceInEur()} EUR")

  aliceAccount.withdraw(1975)
  println(s"Alice's balance after withdrawal: ${aliceAccount.getBalanceInEur()} EUR")
}

trait Account {
  var balance: Int // Balance in EUR-Cents

  def getBalanceInEur(): Double = {
    balance / 100
  }

  def deposit(amount: Int): Unit = {
    balance += amount
  }

  def withdraw(amount: Int): Unit = {
    if (balance >= amount) balance -= amount
    else println("Insufficient funds")
  }
}