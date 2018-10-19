public class AccountValidationException extends AccountException {


    public AccountValidationException(String message,Throwable cause) {

        super(message, cause);
    }

    public AccountValidationException(String message) {

        super(message);
    }


}
