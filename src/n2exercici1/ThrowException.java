package n2exercici1;

public class ThrowException {

    public void f() throws NewException2 {
        try {
            g();
        } catch (NewException e) {
            throw new NewException2("New Exception 2");
        }
    }

    public void g() throws NewException {
        throw new NewException("ARITHMETIC EXCEPTION");
    }


}
