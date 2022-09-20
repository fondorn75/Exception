import java.util.InputMismatchException;
import java.util.Scanner;

// Hеализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

class homework_004 {

    static float inputStrings() {
        float temp = 0f;
        System.out.print("Введите число: ");
        try {
            Scanner sc = new Scanner(System.in);
            temp = sc.nextFloat();
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число. Попробуйте еще раз.");
        }
        return temp;
    }

    public static void main(String[] args) {
        float result = 0f;
        if (result == 0f) {
            inputStrings();
            result = inputStrings();
            System.out.println(String.format("Вы ввели: %s", result));

        } else {

            System.out.println(String.format("Вы ввели: %s", result));
        }

    }
}