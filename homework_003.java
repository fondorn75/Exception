//Реализуйте метод, принимающий в качестве аргументов два целочисленных
//массива, и возвращающий новый массив, каждый элемент которого равен
//частному элементов двух входящих массивов в той же ячейке. Если длины
//массивов не равны, необходимо как-то оповестить пользователя. Важно:
//При выполнении метода единственное исключение, которое пользователь
//может увидеть - RuntimeException, т.е. ваше

public class homework_003 {

    static int[] array1 = new int[] { 5, 4, 3, 8, 9, 6 };
    static int[] array2 = new int[] { 4, 6, 5, 2, 3, 1 };

    static float[] divideTwoArrays(int[] array1, int[] array2) {
        float[] result = new float[6];
        for (int index = 0; index < array1.length; index++) {

            result[index] = array1[index] / array2[index];
        }

        return result;
    }

    static String printArray(float[] array) {
        String result = "";

        for (int index = 0; index < array.length; index++) {
            result += (array[index] + " | ");
        }

        return result;
    }

    static int testExceptions(int[] array1, int[] array2) {
        int tmp1 = array1.length;
        int tmp2 = array2.length;
        int temp = 0;
        for (int index = 0; index < array2.length; index++) {
            temp = array2[index];
            if (temp == 0)
                return -2;
        }
        if (tmp1 != tmp2)
            return -1;

        return 1;
    }

    public static void main(String[] args) {

        switch (testExceptions(array1, array2)) {
            case -1:
                System.out.println("Массивы разной длины.");
                break;
            case -2:
                System.out.println("В массиве есть 0. Деление на 0 не выполняется.");
                break;

            default:
                System.out.println("Операция может быть выполнена.");
                System.out.println(printArray(divideTwoArrays(array1, array2)));
                break;
        }

    }

}
