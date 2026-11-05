// COMP2850 Portfolio: Week 5
// StudentAccount class

package comp2850.banking

class StudentAccount(holder: String) : BankAccount(holder) {

    var overdraft: Int = 0
        set(value) {
            require(value in 0..100) { "Overdraft must be between 0 and 100" }
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance + overdraft >= amount) { "Insufficient funds for withdrawal" }
        
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}
