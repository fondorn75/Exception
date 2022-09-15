
class homework {
    static int minArrayLength = 5;
    static int[] firstArray = new int[] { 15, 25, 36 };

    /**
     * @param array
     * @return
     */
    static int getArrayLength(int[] array) {

        if (array.length >= minArrayLength)
            return array.length;
        if (array.length == 0)
            return -2;

        return -1;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int result = getArrayLength(firstArray);

        if (result == -1)
            System.out.println("Длина массива меньше " + minArrayLength);

        if (result == -2)
            System.out.println("Длина массива 0");

        if (result >= minArrayLength)
            System.out.println("Длина массива " + result);
    }
}
