public class Main {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}