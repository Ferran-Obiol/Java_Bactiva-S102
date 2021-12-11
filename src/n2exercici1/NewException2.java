package n2exercici1;

public class NewException2 extends Exception {

    private final String message;

    @Override
    public String getMessage() {
        return this.message;
    }

    public NewException2(String message) {
        this.message = message;
    }
}
