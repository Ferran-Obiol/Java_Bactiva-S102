package n2exercici2;

public class ThrowException {

    public void f() {
        try {
            g();
        } catch (NewException e) {
            throw new RuntimeException("New Runtime Exception");
        }
    }

    public void g() throws NewException {
        throw new NewException("New Checked Exception");
    }


}
