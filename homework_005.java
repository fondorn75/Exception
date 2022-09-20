public class homework_005 {

    public static void main(String[] args) {
        int[] intArray = new int[] { 7, 8, 6, 5, 4, 7, 6, 9, 7 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }

    }
}
