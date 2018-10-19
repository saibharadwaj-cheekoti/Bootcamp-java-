public class Validator {

    public boolean validate(double balance, double amount) throws AccountOverDueException {

        if (balance<0){
            throw new AccountOverDueException("This account is OD");
        }
        else {
            return true;
        }
    }

}
