package DZ;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class homework_008 {

    static String result = "";
    static String tmp = "";
    static String lastName = "";
    static String firstName = "";
    static String secondName = "";
    static String male = "";
    static String phoneNumber = "";
    static String birthday = "";
    static SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
    static DZ.writeInFile wif = new writeInFile();

    static String getName() throws ParseException {
        System.out.print("Введите ФИО, телефон, дату рождения и пол (f, m): ");

        try (Scanner sc = new Scanner(System.in)) {
            tmp = sc.nextLine();
            String[] splitString = tmp.split(" ");
            String stringDate = splitString[4];

            try {
                Date date = formatter.parse(stringDate);
                System.out.println("Дата рождения: " + date);
            } catch (ClassCastException e) {
                System.out.println("Введена некорректная дата. Еще разок.");
                getName();
            } catch (ParseException e) {
                System.out.println("Дата не на месте. Еще разок.");
                getName();
            }

            String lengchPhone = splitString[3];

            if (splitString.length < 6) {
                System.out.println("Вы ввели не все данные.");
            } else if (lengchPhone.length() < 11) {
                System.out.println("Некорректный номер телефона.");
            } else {
                lastName = splitString[0];
                firstName = splitString[1];
                secondName = splitString[2];
                phoneNumber = splitString[3];
                birthday = splitString[4];
                male = splitString[5];
                result = String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, secondName, phoneNumber,
                        birthday, male);
            }

        }
        return result;
    }

    public static void main(String[] args) throws ParseException {

        String temp = getName();
        System.out.println(temp);
        wif.writeInFile(temp);

    }

}
