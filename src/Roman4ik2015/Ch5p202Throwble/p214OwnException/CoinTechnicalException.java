package Roman4ik2015.Ch5p202Throwble.p214OwnException;

/**
 * Created by a on 08.04.2018.
 */
public class CoinTechnicalException extends Exception {
    public CoinTechnicalException() {
    }
    public CoinTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }
    public CoinTechnicalException(String message) {
        super(message);
    }
    public CoinTechnicalException(Throwable cause) {
        super(cause);
    }
}