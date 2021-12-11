package n1exercici5;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int i = 5;
        while (i >= 0) {
            try {
                System.out.println(array[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getClass());
            }
            i--;
        }
    }
}
