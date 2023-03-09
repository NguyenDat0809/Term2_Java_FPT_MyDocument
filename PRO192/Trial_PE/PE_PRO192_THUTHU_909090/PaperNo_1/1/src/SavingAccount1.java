
public class SavingAccount1 {
    private String accountID;
    private int balance;
    
    public SavingAccount1(){
        accountID = null;
        balance = 0;
    }
    public SavingAccount1(String accountID, int balance){
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    //METHOD
    //withdraw money
    public boolean savingWithdraw(int data_money){
        if(data_money > 0 && data_money <= balance){
            balance -= data_money;
            return true;
        }
        return false;
    }
    //add money to bank
    public boolean savingDeposit(int data_money){
        if(data_money > 0){
            balance += data_money;
            return  true;
        }
        return false;
    }
    //show money
    public int getMoney(){
        return balance;
    }
}
