class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val accNo: Int = n
    var balance: Double = b

    def withdraw(amount: Double): Unit = {
        this.balance -= amount
    }

    def deposit(amount: Double): Unit = {
        this.balance += amount
    }

    def transfer(acc: Account, amount: Double): Unit = {
        this.withdraw(amount)
        acc.deposit(amount)
    }


    override def toString: String = "[" + nic + ":" + accNo + ":" + balance + "]"
}

object Bank extends App {
    var bank : List[Account] = List()

    val overdraft = (b: List[Account]) => b.filter(x => x.balance < 0)
    val balance = (b: List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance))
    val interest = (b: List[Account]) => b.map(x => if (x.balance >= 0) x.balance * 1.05 else x.balance * 1.1)

    bank = bank :+ new Account("1234", 1, 1000)
    bank = bank :+ new Account("5678", 2, -500)
    bank = bank :+ new Account("9101", 3, 2000)
    
    println("Accounts with negative balances: " + overdraft(bank))
    println("Account with the most money: " + balance(bank))
    println("Balances after applying interest: " + interest(bank))

}