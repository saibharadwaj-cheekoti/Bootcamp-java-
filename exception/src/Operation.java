public class Operation {

    public void save(Double amount){


        SavingsAccount savingsAccount = new SavingsAccount();
        try {
            savingsAccount.deposit(amount);
            return;
        } catch (AccountException e) {
            amount = amount*(-1);

        }
        try {
            savingsAccount.deposit(amount);
        }
        catch (AccountException e){
            throw new RuntimeException(e.getMessage());
        }
    }


    public void get(double amount) throws AccountException {
        SavingsAccount savingsAccount = new SavingsAccount();
        try {
            savingsAccount.withdraw(-100.00,-10.0);
        } catch (AccountValidationException e) {
            throw new AccountException("Account valid fail",e);
        }

    }
}
