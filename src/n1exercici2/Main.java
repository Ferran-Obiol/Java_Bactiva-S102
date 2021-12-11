package n1exercici2;

public class Main {

    public static void main(String[] args){
        String string = null;
        try {
            string.split("/r");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
}
