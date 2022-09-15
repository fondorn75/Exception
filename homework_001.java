// Создайте несколько методов, в каждом из которых, на этапе выполнения, JVM выбросит исключение.
// 1. В методе создается целочисленная переменная, которая инициализируется значением 10 / 0
// 2. В методе создается целочисленный массив длиной 10, и в ячейку этого массива с индексом 100 записывается значение 1
// 3. В методе создается строка и инициализируется значением null, затем в консоль выводится длина этой строки

class homework01 {
    static int firstMetod() {
        int result = 10 / 0;

        return result;
    }

    static int[] secondMetod() {

        int[] result = new int[10];

        result[100] = 1;

        return result;
    }

    static int thirdMetod() {
        String temp = null;

        int result = temp.length();

        return result;
    }

    public static void main(String[] args) {
        // System.out.println(firstMetod());
        // System.out.println(secondMetod());
        System.out.println(thirdMetod());
    }
}