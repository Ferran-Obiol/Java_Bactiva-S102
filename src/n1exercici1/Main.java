package n1exercici1;

public class Main {

    public static void main(String[] args){
        try {
            Exception exception = new Exception("Nou missatge d'excepció");
            throw exception;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Clausula finally");
        }
    }
}
