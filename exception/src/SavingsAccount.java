public class SavingsAccount {

    public void deposit(Double amount) throws AccountException {

        if (amount<=0){
            throw new AccountException("Value cannot be less than zero ");
        }
        else {
            System.out.println("Deposit complete"+ amount);
        }


        }

    public void withdraw(Double balance,Double amount) throws AccountValidationException {

        Validator validator = new Validator();

        try {
            if (validator.validate(balance,amount)){
                System.out.println("Success");

            }
        } catch (AccountOverDueException e) {
            throw new AccountValidationException("Balance Insufficient",e);
        }


    }
}
