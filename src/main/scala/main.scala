@main
def main() = {

}

trait Account {
  var balance: Double // Balance in EUR

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (balance >= amount) balance -= amount
    else println("Insufficient funds")
  }
}