package n1exercici3;

public class Main {

    public static void main(String[] args){
        String[] string = {"test"};
        try {
            System.out.println(string[1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
}
