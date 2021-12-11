package n1exercici4;

public class Main {

    public static void main(String[] args) {
        NewException newException = new NewException("new exception");
        try {
            throw newException;
        } catch (NewException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
}
