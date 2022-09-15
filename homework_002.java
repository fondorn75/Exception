//Реализуйте метод, принимающий в качестве аргументов два целочисленных
//массива, и возвращающий новый массив, каждый элемент которого равен
//разности элементов двух входящих массивов в той же ячейке. Если длины
//массивов не равны, необходимо как-то оповестить пользователя.

public class homework_002 {

    static String summTwoArrays(int[] array1, int[] array2) {
        String result = "";
        int temp = 0;
        int tmp1 = array1.length;
        int tmp2 = array2.length;
        if (tmp1 != tmp2)
            return "-1";

        for (int index = 0; index < array1.length; index++) {
            temp = array1[index] + array2[index];
            result += (temp + " ");
        }

        return result;
    }

    static int[] array1 = new int[] { 5, 4, 3, 8, 9, 6 };
    static int[] array2 = new int[] { 7, 2, 6, 3, 8, 2, 4 };

    public static void main(String[] args) {
        System.out.println(summTwoArrays(array1, array2));

    }
}
