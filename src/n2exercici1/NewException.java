package n2exercici1;

public class NewException extends Exception {

    private final String message;

    @Override
    public String getMessage() {
        return this.message;
    }

    public NewException(String message) {
        this.message = message;
    }
}
