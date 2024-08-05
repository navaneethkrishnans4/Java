package com.jap.customexception;

public class Account {

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter






    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     *
     */
    public int  withdraw(int  amount) throws InsufficientFundException{

        if (amount > accountBalance) {
            throw new InsufficientFundException("Insufficient funds in your account");
        } else {
            accountBalance -= amount;
            return accountBalance;
        }
    }


}
