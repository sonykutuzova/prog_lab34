public class TooUglyException extends Exception {
    private final String customMessage;

    public TooUglyException(String message) {
        super(message);
        this.customMessage = "Исключение: " + message;
    }

    @Override
    public String getMessage() {
        return customMessage;
    }
}
