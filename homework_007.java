import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class homework_007 {

    static String stringException() {
        String result = null;
        System.out.print("Введите строку: ");

        try {
            Scanner sc = new Scanner(System.in);
            result = sc.nextLine();
            sc.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }

        return result;
    }

    public static void main(String[] args) {
        String temp = stringException();
        if (temp.length() == 0)
            System.out.println("Введена пустая строка.");

    }

}
