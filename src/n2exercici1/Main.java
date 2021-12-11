package n2exercici1;

public class Main {

    public static void main(String[] args) {
        ThrowException throwException =  new ThrowException();
        try {
            throwException.f();
        } catch (NewException2 e) {
            System.out.println(e.getMessage());
        }
    }
}
