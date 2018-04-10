package Roman4ik2015.Ch5p202Throwble.p214OwnException;

/**
 * Created by a on 08.04.2018.
 */
public class CoinLogicException extends Exception {
    public CoinLogicException() {
    }
    public CoinLogicException(String message, Throwable exception) {
        super(message, exception);
    }
    public CoinLogicException(String message) {
        super(message);
    }
    public CoinLogicException (Throwable exception) {
        super(exception);
    }
}