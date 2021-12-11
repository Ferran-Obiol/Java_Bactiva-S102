package n2exercici2;

public class ThrowException {

    public void f() {
        try {
            g();
        } catch (NewException e) {
            throw new RuntimeException("New Exception 2");
        }
    }

    public void g() throws NewException {
        throw new NewException("ARITHMETIC EXCEPTION");
    }


}
