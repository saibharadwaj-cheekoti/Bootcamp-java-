public class Application {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();

            Operation operation = new Operation();
            operation.save(-10.0);
        try {
            operation.get(10.0);
        } catch (AccountException e) {
            e.printStackTrace();
        }

    }
}
