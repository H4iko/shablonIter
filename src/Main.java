public class Main {

    public static void main(String[] args) {

        for (int r : new Randoms(50, 80)) {
            System.out.println("Случайное число: " + r);
            if (r == 70) {
                System.out.println("Выпало число 70, победа!");
                break;
            }
        }
    }
}
