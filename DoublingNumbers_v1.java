public class DoublingNumbers_v1 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("The double of " + i + " is " + i * 2);
        } while (++i <= 10);
    }
}
